package Company_Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import com.mysql.jdbc.ResultSetMetaData;

import com.toedter.calendar.JDateChooser;
import Customer.Customer;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;


public class Formulaire extends JFrame {
	
	
	DefaultTableModel model;
	private JPanel contentPane;
	private JTable table;
	private JTextField TLFN_TexrField;
	private JTextField TRCM_TKP_TextField;
	private JTextField NTR_TextField;
	private JTextField KNS_TextField;
	private JTextField KYM_VALI_TextField;
	private JTextField KRYE_KRGO_TextField;
	private JTextField TPLM_TextField;
	private JTextField ALN_TextField;
	private JTextField KLN_TexrField;
    private JComboBox   comboBox_Islem;
    private JDateChooser   dateChooser;
   
    String Islem;
    String Ulke,Dil,Yontem;
    String Isme;
   
    
    private JComboBox   comboBox_Ulke;
    private JComboBox   comboBox_Dil;
    private JComboBox  comboBox_Yontem;
 
    
  
    private JTextField textField_Isim;
    private JTextField textField_Id_company;
    
    
    String Date;
    java.util.Date sqldate;
    private JTextField textField_Filter;
    private JTextField textField_DISISLER;
    private JTextField textField_KRKTR;
    private JTextField textField_ITO;
    private JTextField textField_NOT;
    private JTextField textField_SRKT;
    
   
	/**
	 * Launch the application.
	 */
    
   
  
	
	public void showCustomer() {
		
		 
		try {
			  java.sql.Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/trablus","root","");
			  String sql="SELECT * FROM `company`";
			  Statement st=connection.createStatement();
			  ResultSet rs=st.executeQuery(sql);
			  java.sql.ResultSetMetaData rsmd = rs.getMetaData() ;
			  int n =rsmd.getColumnCount();
			  DefaultTableModel model=( DefaultTableModel) table.getModel();
			 model.setRowCount(0);
		     // int index = table.getSelectedRow();

		      
		      int ia = table.getSelectedRow();
				//textField_Id_customer.setText(model.getValueAt(selectedRow,0).toString());
               TableModel model1=table.getModel();
				
              /* textField_Id_customer.setText(model1.getValueAt(ia,0).toString());
				TLFN_TexrField.setText(model1.getValueAt(ia,7).toString());
				NTR_TextField.setText(model1.getValueAt(ia,9).toString());
				KNS_TextField.setText(model1.getValueAt(ia,10).toString());
				KYM_VALI_TextField.setText(model1.getValueAt(ia,11).toString());
				KRYE_KRGO_TextField.setText(model1.getValueAt(ia,12).toString());//
				TPLM_TextField.setText(model1.getValueAt(ia,13).toString());
				ALN_TextField.setText(model1.getValueAt(ia,14).toString());
				KLN_TexrField.setText(model1.getValueAt(ia,15).toString());
				TRCM_TKP_TextField.setText(model1.getValueAt(ia,8).toString());
				textField_Isim.setText(model1.getValueAt(ia,2).toString());
				comboBox_Islem.setSelectedItem(model1.getValueAt(ia,3).toString());
				comboBox_evrak.setSelectedItem(model1.getValueAt(ia,4).toString());
				comboBox_Ulke.setSelectedItem(model1.getValueAt(ia,5).toString());
				comboBox_Dil.setSelectedItem(model1.getValueAt(ia,6).toString());
				comboBox_Yontem.setSelectedItem(model1.getValueAt(ia,16).toString());*/
				
			      //Date Tarih = (Date) table.getValueAt(selected_row,1);
			     
			      //String Evrak_Adi = table.getValueAt(selected_row,4).toString();
			      //String Ulke = table.getValueAt(selected_row,5).toString();
			     // String Dil = table.getValueAt(selected_row,6).toString();
			    
			    
			      
			     
			     
			     
			     
			     
			    //  String yontem = table.getValueAt(selected_row,16).toString();
		      
		      
                 while(rs.next()) {
                	 Vector v = new Vector();
                	 for(int i=0;i<=n;i++) {
                		 
                		 
                		 v.add(rs.getString("Id_company"));
                		 v.add(rs.getString("Tarih"));
                		 v.add(rs.getString("Islem"));
                		 v.add(rs.getString("Isim"));
                		 v.add(rs.getString("Ulke"));
                		 v.add(rs.getString("Dil"));
                		 v.add(rs.getString("TRCM_TKP"));
                		 v.add(rs.getString("NTR"));
                		 v.add(rs.getString("KNS"));
                		 v.add(rs.getString("KYM_VALI"));
                		 v.add(rs.getString("KRYE_KARGO"));
                		 v.add(rs.getString("TPLM"));
                		 v.add(rs.getString("ALN"));               		
                		 v.add(rs.getString("Yontem"));
                		 v.add(rs.getString("TLFN"));
                		 v.add(rs.getString("KLN"));
                		 v.add(rs.getString("DISISLER")); 
                		 v.add(rs.getString("KRKTR"));
                		 v.add(rs.getString("ITO"));
                		 v.add(rs.getString("NOT"));
                		 v.add(rs.getString("SRKT"));
                		
                		
                		 
                		
                		
                		
                		 
                		 
                	 }
                	 model.addRow(v); 	 
                 }
			  
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null,ex);
		}
		
			  
			   
			   
		   }
		  
		   
	   //}
    
   
               
	 public String[] getAllCountries() {
		    String[] countries = new String[Locale.getISOCountries().length];
		    String[] countryCodes = Locale.getISOCountries();
		    for (int i = 0; i < countryCodes.length; i++) {
		        Locale obj = new Locale("", countryCodes[i]);
		        countries[i] = obj.getDisplayCountry();
		    }
		    return countries;
		 }
    
    
  
  
	 
	 
	 
	 
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulaire frame = new Formulaire();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public void setRecordsToTable() {
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/trablus","root","");
			PreparedStatement pst = conn.prepareStatement("SELECT * from company");
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				
				String Isim = rs.getString("Isim");
				String Islem = rs.getString("Islem");
				String Ulke = rs.getString("Ulke");
				java.sql.Date Tarih = rs.getDate("Tarih");
			
				Object[] obj = {Isim,Islem,Ulke,Tarih};
				model = (DefaultTableModel)table.getModel();
				model.addRow(obj);
				
			}
			
			
			
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	public void search(String str) {
		String cari=textField_Filter.getText();
		TableRowSorter tr = new TableRowSorter(model);
		table.setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(cari));
	}
	
	
	public Formulaire() {
		
		setRecordsToTable();
		
		
		
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 708);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 925, 663);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Labelinfos = new JLabel("Sirket islem takibi:");
		Labelinfos.setBounds(232, 11, 293, 23);
		Labelinfos.setFont(new Font("Andalus", Font.BOLD, 20));
		panel.add(Labelinfos);
		
		JLabel Islem_Label = new JLabel("Islem\r\n");
		Islem_Label.setBounds(10, 153, 67, 14);
		Islem_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(Islem_Label);
		
		JLabel Tarih_Label = new JLabel("Tarih\r\n");
		Tarih_Label.setBounds(9, 112, 89, 14);
		Tarih_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(Tarih_Label);
		
		JLabel Ulke_Label = new JLabel("Ulke");
		Ulke_Label.setBounds(10, 234, 57, 14);
		Ulke_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(Ulke_Label);
		
		JLabel Dil_Label = new JLabel("Dil");
		Dil_Label.setBounds(10, 276, 46, 14);
		Dil_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(Dil_Label);
		
		JLabel TLFN_Label = new JLabel("TLFN");
		TLFN_Label.setBounds(386, 356, 88, 14);
		TLFN_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(TLFN_Label);
		
		
		
		 //add
		JButton btnAdd = new JButton("Ekle");
		btnAdd.setBounds(23, 396, 115, 23);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String a;
				
					
				int x1 = 0, x2=0, x3=0, x4=0, x5=0, x6=0, x7=0, x8=0, x9=0;
				
				try {
					
				    x1 = Integer.parseInt(TLFN_TexrField.getText());
				    x2 = Integer.parseInt(TRCM_TKP_TextField.getText());
				    x3 = Integer.parseInt(NTR_TextField.getText());
				    x4 = Integer.parseInt(KNS_TextField.getText());
				    x5 = Integer.parseInt(KYM_VALI_TextField.getText());
				    x6 = Integer.parseInt(KRYE_KRGO_TextField.getText());
				    x7 = Integer.parseInt(TPLM_TextField.getText());
				    x8 = Integer.parseInt(ALN_TextField.getText());
				    x9 = Integer.parseInt(KLN_TexrField.getText());
				     
				} 
				catch (NumberFormatException ex) {
				
					System.out.println(ex);
				    //JOptionPane.showMessageDialog(null,"Lütfen bir numara giriniz! ");//Please enter a number
				}
				
				if(textField_Id_company.getText().isEmpty()|| textField_Isim.getText().isEmpty()|| TRCM_TKP_TextField.getText().isEmpty()||TLFN_TexrField.getText().isEmpty()|| KLN_TexrField.getText().isEmpty()||TPLM_TextField.getText().isEmpty()||ALN_TextField.getText().isEmpty()||NTR_TextField.getText().isEmpty()||KNS_TextField.getText().isEmpty()||KYM_VALI_TextField.getText().isEmpty()||KYM_VALI_TextField.getText().isEmpty()||KRYE_KRGO_TextField.getText().isEmpty()||textField_DISISLER.getText().isEmpty()||textField_KRKTR.getText().isEmpty()||textField_ITO.getText().isEmpty()||textField_NOT.getText().isEmpty()||textField_SRKT.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Lütfen alanı doldurun! ");//
				}
				
				else {
					
					
				 String Isim = textField_Isim.getText().toString();
				 String TLFN = TLFN_TexrField.getText().toString();
				 String TRCM_TKP = TRCM_TKP_TextField.getText().toString();
				 String Id_company = textField_Id_company.getText().toString();
				 String KNL = KLN_TexrField.getText().toString();
				 String TPLM = TPLM_TextField.getText().toString();
				 String ALN = ALN_TextField.getText().toString();
				 String NTR =NTR_TextField.getText().toString();
				 String KNS = KNS_TextField.getText().toString();
				 String KYM_VALI = KYM_VALI_TextField.getText().toString();
				 String KRYE_KARGO = KRYE_KRGO_TextField.getText().toString();
				 String DISISLER= textField_DISISLER.getText().toString();
				  String KRKTR= textField_KRKTR.getText().toString();
				  String ITO= textField_ITO.getText().toString();
				   String NOT= textField_NOT.getText().toString();
				   String SRKT= textField_SRKT.getText().toString();
				
				 
				
				try {
					java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/trablus","root","");
					
					PreparedStatement ps=conn.prepareStatement("INSERT INTO `company`(`Id_company`, `Tarih`, `Islem`, `Isim`, `Ulke`, `Dil`, `TRCM_TKP`, `NTR`, `KNS`, `KYM_VALI`, `KRYE_KARGO`, `TPLM`, `ALN`, `Yontem`, `TLFN`, `KLN`, `DISISLER`, `KRKTR`, `ITO`, `NOT`, `SRKT` ) VALUES   (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					 
					
					SimpleDateFormat Date_Format = new SimpleDateFormat("dd-mm-yyyy"); 
					
					java.util.Date Tarih = new java.util.Date();
					java.sql.Date sqlDate = new java.sql.Date(Tarih.getTime());
					
					ps.setString(1,Id_company);
					ps.setDate(2,sqlDate);
					ps.setString(3,Islem);
					ps.setString(4,Isim);
					ps.setString(5,Ulke);
					ps.setString(6,Dil);
					ps.setString(7,TRCM_TKP);
					ps.setString(8,NTR);
					ps.setString(9,KNS);
					ps.setString(10,KYM_VALI);
					ps.setString(11,KRYE_KARGO);
					ps.setString(12,TPLM);
					ps.setString(13,ALN);
					ps.setString(14,Yontem);
					ps.setString(15,TLFN);
					ps.setString(16,KNL );
					ps.setString(17,DISISLER);
					ps.setString(18,KRKTR);
					ps.setString(19,ITO);
					ps.setString(20,NOT);
					ps.setString(21,SRKT);
					
					ps.executeUpdate();
					
				
					 
					
				     
				 
					textField_Id_company.setText("");
					textField_Isim.setText("");
					TRCM_TKP_TextField.setText("");
					TLFN_TexrField.setText("");
					KLN_TexrField.setText("");
					TPLM_TextField.setText("");
					ALN_TextField.setText("");
					NTR_TextField.setText("");
					KNS_TextField.setText("");
					KYM_VALI_TextField.setText("");
					KRYE_KRGO_TextField.setText("");
					  textField_DISISLER.setText("");
					    textField_KRKTR.setText("");
					    textField_ITO.setText("");
					  textField_NOT.setText("");
					   textField_SRKT.setText("");
					
					
					
					
					showCustomer();
				
				
			}catch(SQLException ex) {
				System.out.println(ex);
			}
			}
			}
		});
		
		
	
		btnAdd.setBackground(SystemColor.info);
		btnAdd.setForeground(SystemColor.activeCaptionText);
		btnAdd.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel.add(btnAdd);
		
		
		
		//Update	
		JButton btnUpdate = new JButton("Güncelle");
		btnUpdate.setBounds(160, 396, 125, 23);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                	try {
							
					java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/trablus","root","");
					int row = table.getSelectedRow();
					String Requete ="UPDATE `company` SET Id_company='"+textField_Id_company.getText().toString()+"', Islem='"+Islem+"', Ulke='"+Ulke+"',Dil='"+Dil+"',TLFN='"+TLFN_TexrField.getText().toString()+"',TRCM_TKP='"+TRCM_TKP_TextField.getText().toString()+"',NTR='"+NTR_TextField.getText().toString()+"',KNS='"+KNS_TextField.getText().toString()+"',KYM_VALI='"+KYM_VALI_TextField.getText().toString()+"',KRYE_KARGO='"+KRYE_KRGO_TextField.getText().toString()+"',TPLM='"+TPLM_TextField.getText().toString()+"',ALN='"+ALN_TextField.getText().toString()+"',KLN='"+KLN_TexrField.getText().toString()+"',Yontem='"+Yontem+"',DISISLER='"+textField_DISISLER.getText().toString()+"',KRKTR='"+textField_KRKTR.getText().toString()+"',ITO='"+textField_ITO.getText().toString()+"'  WHERE `Isim`='"+textField_Isim.getText().toString()+"' "; 
					java.sql.Statement stam= conn.createStatement();
					int y=stam.executeUpdate(Requete);
					JOptionPane.showMessageDialog(null,"Bilgiler değiştirildi ! ");
					
				     // int index = table.getSelectedRow();

				    
						
					textField_Id_company.setText("");
					textField_Isim.setText("");
					TRCM_TKP_TextField.setText("");
					TLFN_TexrField.setText("");
					KLN_TexrField.setText("");
					TPLM_TextField.setText("");
					ALN_TextField.setText("");
					NTR_TextField.setText("");
					KNS_TextField.setText("");
					KYM_VALI_TextField.setText("");
					KRYE_KRGO_TextField.setText("");
					 textField_DISISLER.setText("");
					    textField_KRKTR.setText("");
					    textField_ITO.setText("");
					  textField_NOT.setText("");
					   textField_SRKT.setText("");
					showCustomer();
					
				}
				catch (SQLException ex) {
					   System.out.println("SQL Exception: " + ex.getMessage());
					   ex.printStackTrace();
					}
			}
		});
		btnUpdate.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnUpdate.setBackground(SystemColor.info);
		panel.add(btnUpdate);
		
		
		
		
		
		//Delete
		JButton btnDelete = new JButton("Sil");
		btnDelete.setBounds(306, 396, 115, 23);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Bu satırı silmek istediğinizden emin misiniz? ");//Are you sure you want to delete this row?
					try {
						java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/trablus","root","");
						String requ ="DELETE  FROM `company` WHERE Isim = ? ";//pour supprimer taper son Nom
						PreparedStatement pst = conn.prepareStatement(requ);
						pst.setString(1,(textField_Isim.getText()));//
						
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null,"Müşteri silindi! ");
						
					
						textField_Id_company.setText("");
						textField_Isim.setText("");
					 	TRCM_TKP_TextField.setText("");
						TLFN_TexrField.setText("");
						KLN_TexrField.setText("");
						TPLM_TextField.setText("");
						ALN_TextField.setText("");
						NTR_TextField.setText("");
						KNS_TextField.setText("");
						KYM_VALI_TextField.setText("");
						KRYE_KRGO_TextField.setText("");
						 textField_DISISLER.setText("");
						    textField_KRKTR.setText("");
						    textField_ITO.setText("");
						  textField_NOT.setText("");
						   textField_SRKT.setText("");
						showCustomer();
						
						
				} 
					catch(Exception exe) {
						exe.printStackTrace();
					}
				}     
			});
		
		
		
		btnDelete.setBackground(SystemColor.info);
		btnDelete.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel.add(btnDelete);
		
		JLabel TRCM_TKP_Label = new JLabel("TRCM-TKP");
		TRCM_TKP_Label.setBounds(10, 321, 105, 14);
		TRCM_TKP_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(TRCM_TKP_Label);
		
		JLabel NTR_Label = new JLabel("NTR");
		NTR_Label.setBounds(10, 356, 57, 14);
		NTR_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(NTR_Label);
		
		JLabel KNS_Label = new JLabel("KNS");
		KNS_Label.setBounds(375, 112, 46, 14);
		KNS_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(KNS_Label);
		
		JLabel KYM_VALI_Label = new JLabel("KYM-VALI\r\n");
		KYM_VALI_Label.setBounds(375, 153, 86, 14);
		KYM_VALI_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(KYM_VALI_Label);
		
		JLabel KRYE_KRGO_Label = new JLabel("KRYE-KRGO");
		KRYE_KRGO_Label.setBounds(375, 193, 86, 14);
		KRYE_KRGO_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(KRYE_KRGO_Label);
		
		JLabel TPLM_Label = new JLabel("TPLM");
		TPLM_Label.setBounds(375, 234, 46, 14);
		TPLM_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(TPLM_Label);
		
		JLabel ALN_Label = new JLabel("ALN");
		ALN_Label.setBounds(375, 276, 46, 14);
		ALN_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(ALN_Label);
		
		JLabel KLN_Label = new JLabel("KLN");
		KLN_Label.setBounds(702, 112, 46, 14);
		KLN_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(KLN_Label);
		
		JLabel Yontem_Label = new JLabel("Yontem");
		Yontem_Label.setBounds(377, 321, 73, 14);
		Yontem_Label.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel.add(Yontem_Label);
		
		
		
		
		
		TLFN_TexrField = new JTextField();
		TLFN_TexrField.setBounds(491, 352, 105, 20);
		panel.add(TLFN_TexrField);
		TLFN_TexrField.setColumns(10);
		
		
		
		
		TRCM_TKP_TextField = new JTextField();
		TRCM_TKP_TextField.setBounds(119, 317, 115, 20);
		panel.add(TRCM_TKP_TextField);
		TRCM_TKP_TextField.setColumns(10);
		
		
		
		NTR_TextField = new JTextField();
		NTR_TextField.setBounds(119, 352, 115, 20);
		panel.add(NTR_TextField);
		NTR_TextField.setColumns(10);
		
		
		
		
		KNS_TextField = new JTextField();
		KNS_TextField.setBounds(488, 108, 105, 20);
		panel.add(KNS_TextField);
		KNS_TextField.setColumns(10);
		
		
		
		
		
		KYM_VALI_TextField = new JTextField();
		KYM_VALI_TextField.setBounds(488, 149, 105, 20);
		panel.add(KYM_VALI_TextField);
		KYM_VALI_TextField.setColumns(10);
		
		
		
	
		KRYE_KRGO_TextField = new JTextField();
		KRYE_KRGO_TextField.setBounds(488, 189, 105, 20);
		panel.add(KRYE_KRGO_TextField);
		KRYE_KRGO_TextField.setColumns(10);
		
		
		TPLM_TextField = new JTextField();
		TPLM_TextField.setBounds(488, 230, 105, 20);
		panel.add(TPLM_TextField);
		TPLM_TextField.setColumns(10);
		
		

		ALN_TextField = new JTextField();
		ALN_TextField.setBounds(488, 272, 105, 20);
		panel.add(ALN_TextField);
		ALN_TextField.setColumns(10);
		
		
		
		KLN_TexrField = new JTextField();
		KLN_TexrField.setBounds(785, 108, 105, 20);
		panel.add(KLN_TexrField);
		KLN_TexrField.setColumns(10);
		
		
		
		
		JList list_1 = new JList();
		list_1.setBounds(119, 215, 86, -22);
		panel.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(119, 212, 86, -19);
		
		list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_2.setModel(new AbstractListModel() {
			 String[] values = new String[] {"AR-TR", "AR-FR", "EN-AR"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(list_2);
		
	
		
		
		
		//Islem : 
		
		JComboBox comboBox_Islem = new JComboBox();
		comboBox_Islem.setBounds(119, 153, 115, 22);
		comboBox_Islem.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			 Islem=comboBox_Islem.getSelectedItem().toString();
			}
		});
		
	
		 JComboBox comboBox_Ulke=new JComboBox(getAllCountries());
		 comboBox_Ulke.setBounds(119, 229, 115, 22);
		panel.add(comboBox_Ulke);
		comboBox_Ulke.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 Ulke=comboBox_Ulke.getSelectedItem().toString();
			}
		});
		JComboBox comboBox_Dil = new JComboBox();
		comboBox_Dil.setBounds(119, 271, 115, 22);
		comboBox_Dil.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 Dil=comboBox_Dil.getSelectedItem().toString();
			}
		});
		
	
		JComboBox comboBox_Yontem = new JComboBox();
		comboBox_Yontem.setBounds(488, 307, 105, 22);
		
	
		
		
		comboBox_Yontem.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 Yontem=comboBox_Yontem.getSelectedItem().toString();
				if(Yontem == "BORC") {
					comboBox_Yontem.setBackground(Color.RED);
		
				}
			}
		});
		
		

    	comboBox_Islem.setModel(new DefaultComboBoxModel(new String[] {"Tercume", "Tum Islem", "TRCM+NOTER", "ATDEKONT", "TRCM+NTR+KYMKM", "TRCM-KONSOLOS", "KONSOLOS", "KAYMAKAM", "KNS-KAYMAKAM", "DILEKCE", "SIGORTA", "RANDEVU ALMAN", "UCAK BILETI", "OTEL REZERVASYON", "UCAK+OTEL", "VIZE LIBYA"}));
		panel.add(comboBox_Islem);
		
		comboBox_Yontem.setModel(new DefaultComboBoxModel(new String[] {"HAVALE", "NAKIT", "BORC"}));
		panel.add(comboBox_Yontem);
				
		comboBox_Dil.setModel(new DefaultComboBoxModel(new String[] {"TR-AR", "TR-ING", "ING-TR", "ING-TR", "ING-AR", "AR-ALM", "ING-TR-AR", "TR-MKDN", "MKDN-TR", "TR-RUS", "RUS-TR", "TR-ROM", "ROM-TR", "TR-FR", "FR-TR","KURDS-TR","TR-KURDS","ROM-TR","TR-ROM"}));
		panel.add(comboBox_Dil);
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 430, 870, 240);
		scrollPane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
					
				int i = table.getSelectedRow();
				//textField_Id_customer.setText(model.getValueAt(selectedRow,0).toString());
                 TableModel model=table.getModel();
				
                 textField_Id_company.setText(model.getValueAt(i,0).toString());
				
				/*try {
	
				 DefaultComboBoxModel model = new DefaultComboBoxModel();
				 java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/trablus","root","");
				 String query="SELECT * FROM customer "; //la recherche se fait par entrer le nom de l'utilisateur
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, textField_Isim.getText());
					ResultSet rs=pst.executeQuery();
					if(rs.next()) {
						model.addElement(rs.getString("Islem"));
						String selectedValue = (String) comboBox_Islem.getSelectedItem();
				     
						
						
						TRCM_TKP_TextField.setText(rs.getString("TRCM_TKP"));
						
						//ATTENTION!!
						
						comboBox_Islem.setSelectedItem(rs.getString("Islem"));
						comboBox_Dil.setSelectedItem(rs.getString("Dil"));
						comboBox_Ulke.setSelectedItem(rs.getString("Ulke"));
						comboBox_Yontem.setSelectedItem(rs.getString("Yontem"));
						
						textField_Id_customer.setText(rs.getString("Id_customer"));
						TLFN_TexrField.setText(rs.getString("TLFN"));
						NTR_TextField.setText(rs.getString("NTR"));
						KNS_TextField.setText(rs.getString("KNS"));
						KYM_VALI_TextField.setText(rs.getString("KYM_VALI"));
						KRYE_KRGO_TextField.setText(rs.getString("KRYE_KARGO"));//
						TPLM_TextField.setText(rs.getString("TPLM"));
						ALN_TextField.setText(rs.getString("ALN"));
						KLN_TexrField.setText(rs.getString("KNL"));
						showCustomer();
				
					}
				}
					catch(Exception ex) {
						ex.printStackTrace();
					}*/
				
				
				
				
				/*int row = -table.getRowCount();
				if(row !=0) {
					
					int selected_row=table.getSelectedRow();
					 String Id_customer = table.getValueAt(selected_row,0).toString();
					 String Islem = table.getValueAt(selected_row,3).toString();
				      //Date Tarih = (Date) table.getValueAt(selected_row,1);
				      String Isim =table.getValueAt(selected_row,2).toString();
				      String Evrak_Adi = table.getValueAt(selected_row,4).toString();
				      String Ulke = table.getValueAt(selected_row,5).toString();
				      String Dil = table.getValueAt(selected_row,6).toString();
				      String TLFN = table.getValueAt(selected_row,7).toString();
				      String TRCM_TKP = table.getValueAt(selected_row,8).toString();
				      String NTR = table.getValueAt(selected_row,9).toString();
				      String KNS = table.getValueAt(selected_row,10).toString();
				      String KYM_VALI = table.getValueAt(selected_row,11).toString();
				      String KRYE_KARGO = table.getValueAt(selected_row,12).toString();
				      String TPLM = table.getValueAt(selected_row,13).toString();
				      String ALN = table.getValueAt(selected_row,14).toString();
				      String KNL = table.getValueAt(selected_row,15).toString();
				      String yontem = table.getValueAt(selected_row,16).toString();
					
					
				      textField_Id_customer.setText(Id_customer);
				      //dateChooser.setDate(Tarih);
				      textField_Isim.setText(Isim);
				      TRCM_TKP_TextField.setText(TRCM_TKP);
				      comboBox_Islem.setSelectedItem(Islem);
				      comboBox_evrak.setSelectedItem(Evrak_Adi);
						TLFN_TexrField.setText(TLFN);
						comboBox_Ulke.setSelectedItem(Ulke);
						comboBox_Dil.setSelectedItem(Dil);
						KLN_TexrField.setText(KNL);
						TPLM_TextField.setText(TPLM);
						ALN_TextField.setText(ALN);
						NTR_TextField.setText(NTR);
						KNS_TextField.setText(KNS);
						KYM_VALI_TextField.setText(KYM_VALI);
						KRYE_KRGO_TextField.setText(KRYE_KARGO);
						comboBox_Yontem.setSelectedItem(Yontem);*/
						
				      
				      
				      
				      
				      
				      
				      
					 
				}
				
				
				
				
				
				
				/* int index = table.getSelectedRow();
			      model = (DefaultTableModel) table.getModel();
			      String Id_customer = model.getValueAt(index,0).toString();
			      String Islem = model.getValueAt(index,1).toString();
			      String Tarih = model.getValueAt(index,2).toString();
			      String Isim = model.getValueAt(index,3).toString();
			      String Evrak_Adi = model.getValueAt(index,4).toString();
			      String Ulke = model.getValueAt(index,5).toString();
			      String Dil = model.getValueAt(index,6).toString();
			      String TLFN = model.getValueAt(index,7).toString();
			      String RCM_TKP = model.getValueAt(index,8).toString();
			      String NTR = model.getValueAt(index,9).toString();
			      String KNS = model.getValueAt(index,10).toString();
			      String KYM_VALI = model.getValueAt(index,11).toString();
			      String KRYE_KARGO = model.getValueAt(index,12).toString();
			      String TPLM = model.getValueAt(index,13).toString();
			      String ALN = model.getValueAt(index,14).toString();
			      String KNL = model.getValueAt(index,15).toString();
			      String yontem = model.getValueAt(index,16).toString();*/
				
				
				/*DefaultTableModel model = (DefaultTableModel) table.getModel();
				int index = table.getSelectedRow();
				//String selection = table.getModel().getValueAt(index, 0).toString();
				

				
				textField_Id_customer.setText(model.getValueAt(index,0).toString());
				textField_Isim.setText(model.getValueAt(index,3).toString());
				TRCM_TKP_TextField.setText(model.getValueAt(index,9).toString());
				TLFN_TexrField.setText(model.getValueAt(index,8).toString());
				KLN_TexrField.setText(model.getValueAt(index,16).toString());
				TPLM_TextField.setText(model.getValueAt(index,14).toString());
				ALN_TextField.setText(model.getValueAt(index,15).toString());
				NTR_TextField.setText(model.getValueAt(index,10).toString());
				KNS_TextField.setText(model.getValueAt(index,11).toString());
				KYM_VALI_TextField.setText(model.getValueAt(index,12).toString());
				KRYE_KRGO_TextField.setText(model.getValueAt(index,13).toString());*/
			
				
				
				
		});
		
		panel.add(scrollPane);
		
		
		
		    table = new JTable();
		 
			 
		    
			//panel.add(table);
			table.setBackground(new Color(230, 230, 250));
			 model=new DefaultTableModel();
			 Object[] column= {"Id","Tarih","Islem","Isim","Ulke","Dil","TRCM_TKP","NTR","KNS","KYM_VALI","KRYE_KARGO","TPLM","ALN","Yontem","TLFN","KLN","DISISLER","KRKTR","ITO","NOT","SRKT"};
			 final Object [] row =new Object[21];
			model.setColumnIdentifiers(column);
			table.setModel(model);
			scrollPane.setViewportView(table);
			
			
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			    public void valueChanged(ListSelectionEvent event) {
			        if (!event.getValueIsAdjusting()) {
			            int row = table.getSelectedRow();
			            if (row != -1) {
			                String data = (String) model.getValueAt(row, 0); 
			                textField_Id_company.setText(data);
			                String data1 = (String) model.getValueAt(row, 6);
			                TRCM_TKP_TextField.setText(data1);
			                
			                String data2 = (String) model.getValueAt(row, 14);
			                TLFN_TexrField.setText(data2);
			                
			                String data3 = (String) model.getValueAt(row, 7);
			                NTR_TextField.setText(data3);
			                
			                String data4 = (String) model.getValueAt(row, 8);
			                KNS_TextField.setText(data4);
			                
			                String data5 = (String) model.getValueAt(row, 9);
			                KYM_VALI_TextField.setText(data5);
			                
			                String data6 = (String) model.getValueAt(row, 10);
			                KRYE_KRGO_TextField.setText(data6);
			                
			                String data7 = (String) model.getValueAt(row, 11);
			                TPLM_TextField.setText(data7);
			                
			                String data8 = (String) model.getValueAt(row, 12);
			                ALN_TextField.setText(data8);
			                
			                String data9= (String) model.getValueAt(row, 15);
			                KLN_TexrField.setText(data9);
			                
			                String data10= (String) model.getValueAt(row, 2);
			                comboBox_Islem.setSelectedItem(data10);
			                
			                String data11= (String) model.getValueAt(row, 5);
			                comboBox_Dil.setSelectedItem(data11);
			                
			                
			                String data12= (String) model.getValueAt(row, 4);
			                comboBox_Ulke.setSelectedItem(data12);
			                
							
			                String data13= (String) model.getValueAt(row, 13);
			                comboBox_Yontem.setSelectedItem(data13);
			                

			                String data14= (String) model.getValueAt(row, 3);
			                textField_Isim.setText(data14);
			                
			                
			                String data15= (String) model.getValueAt(row, 16);
			                textField_DISISLER.setText(data15);
							
			                String data16= (String) model.getValueAt(row, 17);
			                textField_KRKTR.setText(data16);
							
							
			                String data17= (String) model.getValueAt(row, 18);
			                textField_ITO.setText(data17);
							
							
			                String data18= (String) model.getValueAt(row, 19);
			                textField_NOT.setText(data18);
							
			                String data19= (String) model.getValueAt(row, 20);
			                textField_SRKT.setText(data19);
							
							
							
							
			                
			            }
			        }
			    }
			});
			
			
			
			 
			
			
			
			//Print 
			JButton btnPrint = new JButton("Yazdır");
			btnPrint.setBounds(447, 396, 107, 23);
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						boolean print = table.print();
						if(!print) {
							JOptionPane.showMessageDialog(null,"Yazdırılamıyor!");
						}
						showCustomer();
						
					}
					catch(PrinterException ex ) {
						JOptionPane.showMessageDialog(null,ex.getMessage());
					
					}
					
				}
			});
			btnPrint.setFont(new Font("Cambria Math", Font.BOLD, 15));
			btnPrint.setBackground(SystemColor.info);
			btnPrint.setForeground(SystemColor.infoText);
			panel.add(btnPrint);
			
			JLabel lblNewLabel = new JLabel("Isim");
			lblNewLabel.setBounds(10, 193, 46, 14);
			lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
			panel.add(lblNewLabel);
			
			textField_Isim = new JTextField();
			textField_Isim.setBounds(119, 189, 115, 20);
			panel.add(textField_Isim);
			textField_Isim.setColumns(10);
			
			
			//Search
			JButton btnSearch = new JButton("Muşteriler");
			btnSearch.setBounds(582, 396, 115, 23);
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/trablus","root","");
						String query="SELECT * FROM company WHERE Isim=?"; //la recherche se fait par entrer le nom de l'utilisateur
						PreparedStatement pst=conn.prepareStatement(query);
						pst.setString(1, textField_Isim.getText());
						//pst.setInt(1,Integer.parseInt(TextFieldI.getText()));
						 DefaultComboBoxModel model = new DefaultComboBoxModel();
						ResultSet rs=pst.executeQuery();
						if(rs.next()) {
							model.addElement(rs.getString("Islem"));
							String selectedValue = (String) comboBox_Islem.getSelectedItem();
					     
							
							
							
							
							//Date
							
							//ATTENTION!!
							
							comboBox_Islem.setSelectedItem(rs.getString("Islem"));
							comboBox_Dil.setSelectedItem(rs.getString("Dil"));
							comboBox_Ulke.setSelectedItem(rs.getString("Ulke"));
							comboBox_Yontem.setSelectedItem(rs.getString("Yontem"));
							
							textField_Id_company.setText(rs.getString("Id_company"));
							TLFN_TexrField.setText(rs.getString("TLFN"));
							NTR_TextField.setText(rs.getString("NTR"));
							KNS_TextField.setText(rs.getString("KNS"));
							KYM_VALI_TextField.setText(rs.getString("KYM_VALI"));
							KRYE_KRGO_TextField.setText(rs.getString("KRYE_KARGO"));//
							TPLM_TextField.setText(rs.getString("TPLM"));
							ALN_TextField.setText(rs.getString("ALN"));
							KLN_TexrField.setText(rs.getString("KLN"));
							//Pro
							TRCM_TKP_TextField.setText(rs.getString("TRCM_TKP"));
							
							 textField_DISISLER.setText(rs.getString("DISISLER"));
							    textField_KRKTR.setText(rs.getString("KRKTR"));
							    textField_ITO.setText(rs.getString("ITO"));
							  textField_NOT.setText(rs.getString("NOT"));
							   textField_SRKT.setText(rs.getString("SRKT"));
							showCustomer();
							
							
						}else {
							JOptionPane.showMessageDialog(null,"Kullanıcı bulunamadı! ");//Aucun utilisateur trouvé
							
						}
						
						conn.close();
						
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
					
					
					
					
				}
			});
			btnSearch.setBackground(SystemColor.info);
			btnSearch.setForeground(SystemColor.textText);
			btnSearch.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 15));
			panel.add(btnSearch);
			
			
			
			//calculation
			JButton btnCalculation = new JButton("Hesapla\r\n");
			btnCalculation.setBounds(736, 396, 115, 23);
			btnCalculation.setBackground(SystemColor.info);
			btnCalculation.setFont(new Font("Cambria Math", Font.BOLD, 15));
			btnCalculation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				    int a = Integer.parseInt(TRCM_TKP_TextField.getText());
					int b = Integer.parseInt(NTR_TextField.getText()); 
					int c = Integer.parseInt(KNS_TextField.getText());
					int d =	 Integer.parseInt(KYM_VALI_TextField.getText()); 
                   int k =  Integer.parseInt(KRYE_KRGO_TextField.getText());
                   int h =  Integer.parseInt(KNS_TextField.getText())  ;
                
                   
                   int sum = a+b+c+d+k+h;
                   TPLM_TextField.setText(" "+sum);
                   
                   
                   
                   int g =  Integer.parseInt(ALN_TextField.getText().toString());
                   
                   int o = g-sum;
                   KLN_TexrField.setText(""+o);
           
                   
			        
					
					
				}
			});
			panel.add(btnCalculation);
			
			
			
			
			//Date
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(119, 106, 115, 20);
			dateChooser.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd"); 
					String Tarih = Date_Format.format(dateChooser.getDate().getTime());
					
					
				}
			});
			panel.add(dateChooser);
		
			/*dateChooser.itemStateChanged()(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					Tarih=((JDateChooser) dateChooser).getSelectedItem().toString();
				}
			});*/
			
			
			
			
			JLabel lblMteriKimlii = new JLabel("Kimlik şirketi");
			lblMteriKimlii.setBounds(10, 76, 105, 14);
			lblMteriKimlii.setFont(new Font("Cambria Math", Font.PLAIN, 16));
			panel.add(lblMteriKimlii);
			
			textField_Id_company = new JTextField();
			textField_Id_company.setBounds(119, 72, 115, 20);
			textField_Id_company.setColumns(10);
			panel.add(textField_Id_company);
			
			textField_Filter = new JTextField();
			textField_Filter.setBounds(488, 53, 192, 28);
			textField_Filter.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					
					String searchstring = textField_Filter.getText();
					search(searchstring);
					
					
					
					
				}
			});
			panel.add(textField_Filter);
			textField_Filter.setColumns(10);
			
			JLabel lblArama = new JLabel("Arama");
			lblArama.setBounds(395, 53, 86, 30);
			lblArama.setFont(new Font("Calibri Light", Font.BOLD | Font.ITALIC, 18));
			panel.add(lblArama);
			
			JLabel DISLabel = new JLabel("DIS ISLER");
			DISLabel.setFont(new Font("Cambria Math", Font.ITALIC, 16));
			DISLabel.setBounds(702, 153, 78, 14);
			panel.add(DISLabel);
			
			textField_DISISLER = new JTextField();
			textField_DISISLER.setColumns(10);
			textField_DISISLER.setBounds(785, 149, 105, 20);
			panel.add(textField_DISISLER);
			
			JLabel KRKTRLabel = new JLabel("KRKTR");
			KRKTRLabel.setFont(new Font("Cambria Math", Font.ITALIC, 16));
			KRKTRLabel.setBounds(702, 193, 89, 14);
			panel.add(KRKTRLabel);
			
			textField_KRKTR = new JTextField();
			textField_KRKTR.setColumns(10);
			textField_KRKTR.setBounds(785, 189, 105, 20);
			panel.add(textField_KRKTR);
			
			JLabel ITOLabel = new JLabel("ITO");
			ITOLabel.setFont(new Font("Cambria Math", Font.ITALIC, 16));
			ITOLabel.setBounds(702, 235, 100, 14);
			panel.add(ITOLabel);
			
			textField_ITO = new JTextField();
			textField_ITO.setColumns(10);
			textField_ITO.setBounds(785, 230, 105, 20);
			panel.add(textField_ITO);
			
			JLabel NOTLabel = new JLabel("NOT\r\n");
			NOTLabel.setFont(new Font("Cambria Math", Font.ITALIC, 16));
			NOTLabel.setBounds(702, 277, 100, 14);
			panel.add(NOTLabel);
			
			textField_NOT = new JTextField();
			textField_NOT.setColumns(10);
			textField_NOT.setBounds(785, 272, 105, 20);
			panel.add(textField_NOT);
			
			JLabel SRKTLabel = new JLabel("SRKT");
			SRKTLabel.setFont(new Font("Cambria Math", Font.ITALIC, 16));
			SRKTLabel.setBounds(702, 307, 100, 14);
			panel.add(SRKTLabel);
			
			textField_SRKT = new JTextField();
			textField_SRKT.setColumns(10);
			textField_SRKT.setBounds(785, 304, 105, 20);
			panel.add(textField_SRKT);
			
			JButton btnTemizlemek = new JButton("Temizlemek"); //Clear
			btnTemizlemek.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					textField_Id_company.setText("");
					textField_Isim.setText("");
				 	TRCM_TKP_TextField.setText("");
					TLFN_TexrField.setText("");
					KLN_TexrField.setText("");
					TPLM_TextField.setText("");
					ALN_TextField.setText("");
					NTR_TextField.setText("");
					KNS_TextField.setText("");
					KYM_VALI_TextField.setText("");
					KRYE_KRGO_TextField.setText("");
					 textField_DISISLER.setText("");
					    textField_KRKTR.setText("");
					    textField_ITO.setText("");
					  textField_NOT.setText("");
					   textField_SRKT.setText("");
					
					
					
					
				}
			});
			btnTemizlemek.setFont(new Font("Cambria Math", Font.BOLD, 15));
			btnTemizlemek.setBackground(SystemColor.info);
			btnTemizlemek.setBounds(775, 57, 115, 23);
			panel.add(btnTemizlemek);
			
			
			
			
	}
}











