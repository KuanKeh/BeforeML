package weng.foxnrabbit.foxnrabbit;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import weng.foxnrabbit.animal.Animal;
import weng.foxnrabbit.animal.Fox;
import weng.foxnrabbit.animal.Rabbit;
import weng.foxnrabbit.cell.Cell;
import weng.foxnrabbit.field.Field;
import weng.foxnrabbit.field.Location;
import weng.foxnrabbit.field.View;

public class FoxAndRabbit {
	private Field theField;
	private View theView;
	private JFrame frame;
	
//	private class StepListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			step();
//			frame.repaint();
//		}
//	}
	
	public FoxAndRabbit(int size) {
		final int cc = 0;
		theField = new Field(size, size);
		for ( int row = 0; row<theField.getHeight(); row++ ) {
			for ( int col = 0; col<theField.getWidth(); col++ ) {
				double probability = Math.random();
				if ( probability < 0.05 ) {
					theField.place(row, col, new Fox());
				} else if ( probability < 0.15 ) {
					theField.place(row, col, new Rabbit());
				} 
			}
		}
		theView = new View(theField);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(theView);
		JButton btnStep = new JButton("单步");
		frame.add(btnStep,BorderLayout.NORTH);
//		btnStep.addActionListener(new StepListener());
		btnStep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				step();//可以访问函数所在类的成员函数
				frame.repaint();//可以访问函数所在类的成员变量
				int dd = cc;//只能访问函数中的final变量
			}
		});
		frame.pack();
		frame.setVisible(true);
	}
	
	public void start(int steps) {
		for ( int i=0; i<steps; i++ ) {
			step();
			theView.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void step() {
		for ( int row = 0; row< theField.getHeight(); row++ ) {
			for ( int col = 0; col < theField.getWidth(); col++ ) {
				Cell cell = theField.get(row, col);
				if ( cell != null ) {
					Animal animal = (Animal)cell;
					animal.grow();
					if ( animal.isAlive() ) {
						//	move
						Location loc = animal.move(theField.getFreeNeighbour(row, col));
						if ( loc != null ) {
							theField.move(row, col, loc);
						}
						//	eat
//						animal.eat(theField);
						Cell[] neighbour = theField.getNeighbour(row, col);
						ArrayList<Animal> listRabbit = new ArrayList<Animal>();
						for ( Cell an : neighbour ) {
							if ( an instanceof Rabbit ) {
								listRabbit.add((Rabbit)an);
							}
						}
						if ( !listRabbit.isEmpty() ) {
							Animal fed = animal.feed(listRabbit);
							if ( fed != null ) {
								theField.remove((Cell)fed);
							}
						}
						//	breed
						Animal baby = animal.breed();
						if ( baby != null ) {
							theField.placeRandomAdj(row, col, (Cell)baby);
						}
					} else {
						theField.remove(row, col);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FoxAndRabbit fnr = new FoxAndRabbit(50);
		fnr.start(10);
	}

}
