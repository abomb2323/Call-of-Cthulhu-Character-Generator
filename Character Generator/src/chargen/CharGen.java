/*
 * Author: Adam Crick
 * Date: 4/15/2015
 * Description: Used for generating characters/NPCs in the Call of Cthulhu tabletop RPG
 * Version: 1.0
 */

package chargen;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.AbstractListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;

public class CharGen{

	public JFrame frmCocCharacterGenerator;
	
	
	Character character;
	private JTextField txtSanityPoints;
	private JTextField txtMagicPoints;
	private JTextField txtHitPoints;
	private JTextField txtDamageBonus;
	private JTextField txtcthulhuMythos;
	
	/**
	 * Create the application.
	 */
	public CharGen() {
		initialize();
		
		
	}
	
	public static void main(String[] args){
		
		CharGen window = new CharGen();
		window.frmCocCharacterGenerator.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmCocCharacterGenerator = new JFrame();
		frmCocCharacterGenerator.setResizable(false);
		frmCocCharacterGenerator.setTitle("Call of Cthulhu Character Generator V1.0");
		frmCocCharacterGenerator.setBounds(100, 100, 640, 500);
		frmCocCharacterGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmCocCharacterGenerator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtpnLkj = new JTextArea();
		txtpnLkj.setWrapStyleWord(true);
		txtpnLkj.setLineWrap(true);
		txtpnLkj.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnLkj.setText("Welcome to the Call of Cthulhu Character Generator! Enter the information in the fields below, and hit \"Generate Character\" ");
		txtpnLkj.setEditable(false);
		txtpnLkj.setBounds(140, 15, 340, 51);
		panel.add(txtpnLkj);
		
		JTextArea STRArea = new JTextArea();
		STRArea.setEditable(false);
		STRArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		STRArea.setBackground(Color.WHITE);
		STRArea.setBounds(55, 251, 107, 30);
		panel.add(STRArea);
		
		JTextArea DEXArea = new JTextArea();
		DEXArea.setEditable(false);
		DEXArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		DEXArea.setBackground(Color.WHITE);
		DEXArea.setBounds(172, 251, 107, 30);
		panel.add(DEXArea);
		
		JTextArea INTArea = new JTextArea();
		INTArea.setEditable(false);
		INTArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		INTArea.setBackground(Color.WHITE);
		INTArea.setBounds(289, 251, 107, 30);
		panel.add(INTArea);
		
		JTextArea IDEAArea = new JTextArea();
		IDEAArea.setEditable(false);
		IDEAArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		IDEAArea.setBackground(Color.WHITE);
		IDEAArea.setBounds(406, 251, 107, 30);
		panel.add(IDEAArea);
		
		JTextArea CONArea = new JTextArea();
		CONArea.setEditable(false);
		CONArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		CONArea.setBackground(Color.WHITE);
		CONArea.setBounds(55, 287, 107, 30);
		panel.add(CONArea);
		
		JTextArea APPArea = new JTextArea();
		APPArea.setEditable(false);
		APPArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		APPArea.setBackground(Color.WHITE);
		APPArea.setBounds(172, 287, 107, 30);
		panel.add(APPArea);
		
		JTextArea POWArea = new JTextArea();
		POWArea.setEditable(false);
		POWArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		POWArea.setBackground(Color.WHITE);
		POWArea.setBounds(289, 287, 107, 30);
		panel.add(POWArea);
		
		JTextArea LUCKArea = new JTextArea();
		LUCKArea.setEditable(false);
		LUCKArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		LUCKArea.setBackground(Color.WHITE);
		LUCKArea.setBounds(406, 287, 107, 30);
		panel.add(LUCKArea);
		
		JTextArea SIZArea = new JTextArea();
		SIZArea.setEditable(false);
		SIZArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		SIZArea.setBackground(Color.WHITE);
		SIZArea.setBounds(55, 323, 107, 30);
		panel.add(SIZArea);
		
		JTextArea SANArea = new JTextArea();
		SANArea.setEditable(false);
		SANArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		SANArea.setBackground(Color.WHITE);
		SANArea.setBounds(172, 323, 107, 30);
		panel.add(SANArea);
		
		JTextArea EDUArea = new JTextArea();
		EDUArea.setEditable(false);
		EDUArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		EDUArea.setBackground(Color.WHITE);
		EDUArea.setBounds(289, 323, 107, 30);
		panel.add(EDUArea);
		
		JTextArea KNOWArea = new JTextArea();
		KNOWArea.setEditable(false);
		KNOWArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		KNOWArea.setBackground(Color.WHITE);
		KNOWArea.setBounds(406, 323, 107, 30);
		panel.add(KNOWArea);
		
		JList<String> GENDERArea = new JList<String>();
		GENDERArea.setModel(new AbstractListModel<String>() {
			/**
			 * I need this apparently to make it happy
			 */
			private static final long serialVersionUID = 1878473853980246254L;
			String[] values = new String[] {"Male", "Female"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		GENDERArea.setToolTipText("Gender");
		GENDERArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GENDERArea.setBounds(55, 74, 50, 51);
		panel.add(GENDERArea);
		
		JFormattedTextField AGEMINArea = new JFormattedTextField();
		AGEMINArea.setText("Min Age");
		AGEMINArea.setHorizontalAlignment(SwingConstants.CENTER);
		AGEMINArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AGEMINArea.setToolTipText("Minimum Age (0-100)");
		AGEMINArea.setBounds(115, 74, 67, 51);
		panel.add(AGEMINArea);
		
		JFormattedTextField AGEMAXArea = new JFormattedTextField();
		AGEMAXArea.setText("Max Age");
		AGEMAXArea.setToolTipText("Maximum Age (0-100)");
		AGEMAXArea.setHorizontalAlignment(SwingConstants.CENTER);
		AGEMAXArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		AGEMAXArea.setBounds(192, 74, 67, 51);
		panel.add(AGEMAXArea);
		
		JFormattedTextField MYTHOSArea = new JFormattedTextField();
		MYTHOSArea.setText("0");
		MYTHOSArea.setToolTipText("Cthulhu Mythos Knowledge (0-99)");
		MYTHOSArea.setHorizontalAlignment(SwingConstants.CENTER);
		MYTHOSArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MYTHOSArea.setBounds(269, 74, 50, 51);
		panel.add(MYTHOSArea);
		
		JButton btnGenerateCharacter = new JButton("Generate Character");
		btnGenerateCharacter.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(64, 64, 64), new Color(128, 128, 128), Color.LIGHT_GRAY, Color.BLACK));
		btnGenerateCharacter.setBounds(65, 136, 254, 30);
		panel.add(btnGenerateCharacter);
		
		
		JTextArea NameAgeArea = new JTextArea();
		NameAgeArea.setFont(new Font("Miriam Fixed", Font.PLAIN, 16));
		NameAgeArea.setEditable(false);
		NameAgeArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		NameAgeArea.setBackground(Color.WHITE);
		NameAgeArea.setBounds(35, 199, 510, 30);
		panel.add(NameAgeArea);
		
		JTextArea HPArea = new JTextArea();
		HPArea.setToolTipText("HP");
		HPArea.setFont(new Font("Monospaced", Font.PLAIN, 40));
		HPArea.setEditable(false);
		HPArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		HPArea.setBackground(Color.WHITE);
		HPArea.setBounds(247, 364, 67, 51);
		panel.add(HPArea);
		
		JTextArea MAGICArea = new JTextArea();
		MAGICArea.setToolTipText("Magic Points");
		MAGICArea.setFont(new Font("Monospaced", Font.PLAIN, 40));
		MAGICArea.setEditable(false);
		MAGICArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		MAGICArea.setBackground(Color.WHITE);
		MAGICArea.setBounds(151, 364, 67, 51);
		panel.add(MAGICArea);
		
		JTextArea SANITYArea = new JTextArea();
		SANITYArea.setToolTipText("Sanity Points");
		SANITYArea.setFont(new Font("Monospaced", Font.PLAIN, 40));
		SANITYArea.setEditable(false);
		SANITYArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		SANITYArea.setBackground(Color.WHITE);
		SANITYArea.setBounds(55, 364, 67, 51);
		panel.add(SANITYArea);
		
		JTextArea DMGBONUSArea = new JTextArea();
		DMGBONUSArea.setToolTipText("Dmg Bonus");
		DMGBONUSArea.setFont(new Font("Monospaced", Font.PLAIN, 24));
		DMGBONUSArea.setEditable(false);
		DMGBONUSArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		DMGBONUSArea.setBackground(Color.WHITE);
		DMGBONUSArea.setBounds(343, 365, 67, 45);
		panel.add(DMGBONUSArea);
		
		txtSanityPoints = new JTextField();
		txtSanityPoints.setEditable(false);
		txtSanityPoints.setText("Sanity Points");
		txtSanityPoints.setBounds(55, 421, 86, 20);
		panel.add(txtSanityPoints);
		txtSanityPoints.setColumns(10);
		
		txtMagicPoints = new JTextField();
		txtMagicPoints.setEditable(false);
		txtMagicPoints.setText("Magic Points");
		txtMagicPoints.setColumns(10);
		txtMagicPoints.setBounds(151, 421, 86, 20);
		panel.add(txtMagicPoints);
		
		txtHitPoints = new JTextField();
		txtHitPoints.setEditable(false);
		txtHitPoints.setText("Hit Points");
		txtHitPoints.setColumns(10);
		txtHitPoints.setBounds(247, 421, 86, 20);
		panel.add(txtHitPoints);
		
		txtDamageBonus = new JTextField();
		txtDamageBonus.setText("Damage Bonus");
		txtDamageBonus.setEditable(false);
		txtDamageBonus.setColumns(10);
		txtDamageBonus.setBounds(343, 421, 86, 20);
		panel.add(txtDamageBonus);
		
		JTextArea MYTHOSArea_1 = new JTextArea();
		MYTHOSArea_1.setToolTipText("99-Cthulhu Mythos");
		MYTHOSArea_1.setFont(new Font("Monospaced", Font.PLAIN, 24));
		MYTHOSArea_1.setEditable(false);
		MYTHOSArea_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.BLACK));
		MYTHOSArea_1.setBackground(Color.WHITE);
		MYTHOSArea_1.setBounds(439, 365, 67, 45);
		panel.add(MYTHOSArea_1);
		
		txtcthulhuMythos = new JTextField();
		txtcthulhuMythos.setText("99-Cthulhu Mythos");
		txtcthulhuMythos.setEditable(false);
		txtcthulhuMythos.setColumns(10);
		txtcthulhuMythos.setBounds(439, 421, 107, 20);
		panel.add(txtcthulhuMythos);
		
		btnGenerateCharacter.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent evt) {
		        String gender = GENDERArea.getSelectedValue();
		        int ageMin = Integer.parseInt(AGEMINArea.getText());
		        int ageMax = Integer.parseInt(AGEMAXArea.getText());
		        int mythos = Integer.parseInt(MYTHOSArea.getText());
		       		        
		        character = new Character(gender, mythos,ageMin, ageMax);
		        
		        NameAgeArea.setText("Name: " + character.getFirstName() + " " + character.getLastName() + ", " + character.getGender() + "  ||  Age: " + character.getAge());
		        STRArea.setText("   STR: " + character.getSTR());
		        DEXArea.setText("   DEX: " + character.getDEX());
		        INTArea.setText("   INT: " + character.getINT());
		        IDEAArea.setText("   IDEA: " + character.getIDEA());
		        CONArea.setText("   CON: " + character.getCON());
		        APPArea.setText("   APP: " + character.getAPP());
		        POWArea.setText("   POW: " + character.getPOW());
		        LUCKArea.setText("   LUCK: " + character.getLUCK());
		        SIZArea.setText("   SIZ: " + character.getSIZ());
		        SANArea.setText("   SAN: " + character.getSAN());
		        EDUArea.setText("   EDU: " + character.getEDU());
		        KNOWArea.setText("   KNOW: " + character.getKNOW());
		        HPArea.setText("" + character.getHP());
		        SANITYArea.setText("" + character.getSAN());
		        DMGBONUSArea.setText(character.getDmgBonus());
		        MAGICArea.setText("" + character.getPOW());
		        MYTHOSArea_1.setText("" + character.getMythos());
		    }
		});
		
	}
}
