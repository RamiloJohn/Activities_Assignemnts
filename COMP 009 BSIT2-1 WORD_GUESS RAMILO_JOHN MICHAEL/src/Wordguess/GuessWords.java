package Wordguess;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

public class GuessWords {

	private JFrame frame;
	private String[][] listOfWords = new String[3][20];
	private int level = 1;
	private String pickedWord = "";
	private String completeAnswer = "";
	private String displayedWord = "";
	private int mistakes;
	private int givenLetterIndex1 = 0;
	private int givenLetterIndex2 = 0;
	JLabel lblLblword;
	private JPanel panel, panel_1;
	private JButton btnA,btnB,btnC,btnD,btnE,btnF,btnG,btnH,btnI,btnJ,btnK,btnL,btnM,btnN,btnO,btnP,btnQ,btnR,btnS,btnT,btnU,btnV,btnW,btnX,btnY,btnZ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessWords window = new GuessWords();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuessWords() {
		initialize();
		
		panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(125, 36, 565, 391);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JLabel lblWordguess = new JLabel("WordGuess 1.0");
		lblWordguess.setForeground(Color.ORANGE);
		lblWordguess.setFont(new Font("Comic Sans MS", Font.BOLD, 37));
		lblWordguess.setBounds(10, 11, 301, 52);
		panel_1.add(lblWordguess);
		
		JLabel lblAuthorFFF = new JLabel("Author: FFF");
		lblAuthorFFF.setBounds(20, 58, 150, 14);
		panel_1.add(lblAuthorFFF);
		
		JLabel label = new JLabel("2024");
		label.setBounds(20, 74, 46, 14);
		panel_1.add(label);
		
		JTextPane txtpnTextareasettextthisIsMy = new JTextPane();
		txtpnTextareasettextthisIsMy.setRequestFocusEnabled(false);
		txtpnTextareasettextthisIsMy.setEditable(false);
		txtpnTextareasettextthisIsMy.setText("This is my version of Hangman. Guess the word using the keyboard. There are no limitation on how many tries you can have. There are three levels and you can choose the level you want after you guessed the word correctly. Have fun!");
		txtpnTextareasettextthisIsMy.setBounds(20, 104, 521, 211);
		panel_1.add(txtpnTextareasettextthisIsMy);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(251, 326, 89, 23);
		panel_1.add(btnOk);
		btnOk.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_1.setVisible(false);
						panel.setEnabled(true);
						btnA.setVisible(true);
						btnB.setVisible(true);
						btnC.setVisible(true);
						btnD.setVisible(true);
						btnE.setVisible(true);
						btnF.setVisible(true);
						btnG.setVisible(true);
						btnH.setVisible(true);
						btnI.setVisible(true);
						btnJ.setVisible(true);
						btnK.setVisible(true);
						btnL.setVisible(true);
						btnM.setVisible(true);
						btnN.setVisible(true);
						btnO.setVisible(true);
						btnP.setVisible(true);
						btnQ.setVisible(true);
						btnR.setVisible(true);
						btnS.setVisible(true);
						btnT.setVisible(true);
						btnU.setVisible(true);
						btnV.setVisible(true);
						btnW.setVisible(true);
						btnX.setVisible(true);
						btnY.setVisible(true);
						btnZ.setVisible(true);
					}
				});
		
		lblLblword = new JLabel(pickWord());
		lblLblword.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblLblword.setHorizontalAlignment(SwingConstants.CENTER);
		lblLblword.setBounds(10, 23, 764, 102);
		lblLblword.setFocusable(true);
		frame.getContentPane().add(lblLblword);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Keyboard", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(125, 220, 565, 190);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		// **********************keyboard************************************
		// *************layer 1 ***************
		btnQ = new JButton("Q");
		btnQ.setBounds(10, 15, 50, 50);
		panel.add(btnQ);
		btnQ.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnQ.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('Q');
					}
				});
		
		btnW = new JButton("W");
		btnW.setBounds(65, 15, 50, 50);
		panel.add(btnW);
		btnW.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnW.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('W');
					}
				});
		
		btnE = new JButton("E");
		btnE.setBounds(120, 15, 50, 50);
		panel.add(btnE);
		btnE.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnE.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('E');
					}
				});
		
		btnR = new JButton("R");
		btnR.setBounds(175, 15, 50, 50);
		panel.add(btnR);
		btnR.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnR.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('R');
					}
				});
		
		btnT = new JButton("T");
		btnT.setBounds(230, 15, 50, 50);
		panel.add(btnT);
		btnT.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnT.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('T');
					}
				});
		
		btnY = new JButton("Y");
		btnY.setBounds(285, 15, 50, 50);
		panel.add(btnY);
		btnY.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnY.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('Y');
					}
				});
		
		btnU = new JButton("U");
		btnU.setBounds(340, 15, 50, 50);
		panel.add(btnU);
		btnU.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnU.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('U');
					}
				});
		
		btnI = new JButton("I");
		btnI.setBounds(395, 15, 50, 50);
		panel.add(btnI);
		btnI.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnI.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('I');
					}
				});
		
		btnO = new JButton("O");
		btnO.setBounds(450, 15, 50, 50);
		panel.add(btnO);
		btnO.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnO.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('O');
					}
				});
		
		btnP = new JButton("P");
		btnP.setBounds(505, 15, 50, 50);
		panel.add(btnP);
		btnP.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnP.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('P');
					}
				});
		
		// *************layer 2 ***************
		btnA = new JButton("A");
		btnA.setBounds(30, 76, 50, 50);
		panel.add(btnA);
		btnA.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnA.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('A');
					}
				});
		
		btnS = new JButton("S");
		btnS.setBounds(85, 76, 50, 50);
		panel.add(btnS);
		btnS.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnS.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('S');
					}
				});
		
		btnD = new JButton("D");
		btnD.setBounds(140, 76, 50, 50);
		panel.add(btnD);
		btnD.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnD.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('D');
					}
				});
		
		btnF = new JButton("F");
		btnF.setBounds(195, 76, 50, 50);
		panel.add(btnF);
		btnF.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnF.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('F');
					}
				});
		
		btnG = new JButton("G");
		btnG.setBounds(250, 76, 50, 50);
		panel.add(btnG);
		btnG.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnG.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('G');
					}
				});
		
		btnH = new JButton("H");
		btnH.setBounds(305, 76, 50, 50);
		panel.add(btnH);
		btnH.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnH.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('H');
					}
				});
		
		btnJ = new JButton("J");
		btnJ.setBounds(360, 76, 50, 50);
		panel.add(btnJ);
		btnJ.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnJ.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('J');
					}
				});
		
		btnK = new JButton("K");
		btnK.setBounds(415, 76, 50, 50);
		panel.add(btnK);
		btnK.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnK.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('K');
					}
				});
		
		btnL = new JButton("L");
		btnL.setBounds(470, 76, 50, 50);
		panel.add(btnL);
		btnL.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnL.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('L');
					}
				});
		
		// *************layer 3 ***************
		btnZ = new JButton("Z");
		btnZ.setBounds(85, 132, 50, 50);
		panel.add(btnZ);
		btnZ.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnZ.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('Z');
					}
				});
		
		btnX = new JButton("X");
		btnX.setBounds(140, 132, 50, 50);
		panel.add(btnX);
		btnX.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnX.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('X');
					}
				});
		
		btnC = new JButton("C");
		btnC.setBounds(195, 132, 50, 50);
		panel.add(btnC);
		btnC.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnC.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('C');
					}
				});
		
		btnV = new JButton("V");
		btnV.setBounds(250, 132, 50, 50);
		panel.add(btnV);
		btnV.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnV.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('V');
					}
				});
		
		btnB = new JButton("B");
		btnB.setBounds(305, 132, 50, 50);
		panel.add(btnB);
		btnB.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnB.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('B');
					}
				});
		
		btnN = new JButton("N");
		btnN.setBounds(360, 132, 50, 50);
		panel.add(btnN);
		btnN.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnN.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('N');
					}
				});
		
		btnM = new JButton("M");
		btnM.setBounds(415, 132, 50, 50);
		panel.add(btnM);
		btnM.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnM.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validateGuess('M');
					}
				});
		
		// **********************keyboard************************************
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem1 = new JMenuItem("About");
		mntmNewMenuItem1.setSize(50, 50);
		mntmNewMenuItem1.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_1.setVisible(true);
						panel.setEnabled(false);
						btnA.setVisible(false);
						btnB.setVisible(false);
						btnC.setVisible(false);
						btnD.setVisible(false);
						btnE.setVisible(false);
						btnF.setVisible(false);
						btnG.setVisible(false);
						btnH.setVisible(false);
						btnI.setVisible(false);
						btnJ.setVisible(false);
						btnK.setVisible(false);
						btnL.setVisible(false);
						btnM.setVisible(false);
						btnN.setVisible(false);
						btnO.setVisible(false);
						btnP.setVisible(false);
						btnQ.setVisible(false);
						btnR.setVisible(false);
						btnS.setVisible(false);
						btnT.setVisible(false);
						btnU.setVisible(false);
						btnV.setVisible(false);
						btnW.setVisible(false);
						btnX.setVisible(false);
						btnY.setVisible(false);
						btnZ.setVisible(false);
					}
				});
		menuBar.add(mntmNewMenuItem1);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 800, 500);
		//frame.setUndecorated(true);
		frame.setTitle("WordGuess 1.0");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		loadWords();
	}
	
	/**
	 * This will pick and display the word to be guessed.
	 */
	private String pickWord() {
		Random randomizer = new Random();
		int index = randomizer.nextInt(20);
		
		pickedWord = listOfWords[level-1][index].toUpperCase();
		
		givenLetterIndex1 = randomizer.nextInt(pickedWord.length());
		do {
			givenLetterIndex2 = randomizer.nextInt(pickedWord.length());
		} while (givenLetterIndex1 == givenLetterIndex2);
		
		for (int ctr = 0; ctr < pickedWord.length(); ctr++) {
			completeAnswer = completeAnswer + " " + pickedWord.charAt(ctr);
			if (givenLetterIndex1 == ctr || givenLetterIndex2 == ctr) {
				displayedWord = displayedWord + " " + pickedWord.charAt(ctr);
			} else {
				displayedWord = displayedWord + " _";
			}
		}
		
		return displayedWord;
	}
	
	@SuppressWarnings("static-access")
	private void validateGuess(char letter) {
	    boolean correct = false;
	    char[] charWord = displayedWord.toCharArray();
	    

	    for (int ctr = 0; ctr < pickedWord.length(); ctr++) {
	        if (givenLetterIndex1 == ctr || givenLetterIndex2 == ctr) {
	           
	        } else {
	            if (pickedWord.charAt(ctr) == letter) {
	                charWord[ctr * 2 + 1] = pickedWord.charAt(ctr);
	                correct = true;
	            }
	        }
	    }
	    
	    
	    if (!correct) {
	        mistakes++;
	        
	        if (mistakes >= 5) {
	        displayedWord = new String(charWord);
		    lblLblword.setText(displayedWord);
	        	
	        mistakes = 0;
	        String[] options = {"Four-Letter Word", "Five-Letter Word", "Six-Letter Word", "Exit"};
            int chosenOption = JOptionPane.showOptionDialog(frame, "GAME OVER! Please choose level", "You Reached Mistake Limit!", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
            level = chosenOption + 1;
         
            switch (chosenOption) {
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            	}  
            displayedWord = "";
            completeAnswer = "";
            lblLblword.setText(pickWord());
            
            } else {      
	        JOptionPane.showMessageDialog(frame, "Incorrect Letter! Mistakes: " + mistakes);
            }
	        
	        
	    } else {
	        
	        displayedWord = new String(charWord);
	        lblLblword.setText(displayedWord);
	        
	        
	        if (displayedWord.equals(completeAnswer)) {
	            mistakes = 0;
	            String[] options = {"Four-Letter Word", "Five-Letter Word", "Six-Letter Word", "Exit"};
	            int chosenOption = JOptionPane.showOptionDialog(frame, "CONGRATULATIONS! Please choose level", "Word guessed!", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
	            level = chosenOption + 1;
	         
	            switch (chosenOption) {
	                case 3:
	                    System.exit(0);
	                    break;
	                default:
	                    break;
	            }
	            
	      
	            displayedWord = "";
	            completeAnswer = "";
	            lblLblword.setText(pickWord());
	        }
	    }
	}


	private void loadWords() {
	    try {
	        CSVReader reader = new CSVReader(new FileReader("C:\\Java Codess\\COMP 009 BSIT2-1 WORD_GUESS RAMILO_JOHN MICHAEL\\src\\Wordguess\\GuessWords1.csv"));
	        String[] nextLine;
	        int i = 0;
	        while ((nextLine = reader.readNext()) != null) {
	            listOfWords[i++] = nextLine;
	        }
	        reader.close();
	    } catch (IOException | CsvValidationException e) {
	        e.printStackTrace();
	    }
	}
}
