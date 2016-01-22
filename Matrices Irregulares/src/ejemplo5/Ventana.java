package ejemplo5;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField distTotal;

	private int distancias[][]={
			{171},
			{369,294},
			{366,537,663},
			{525,696,604,318},
			{540,515,809,717,1022},
			{646,817,958,401,694,620},
			{488,659,800,243,536,583,158},
			{504,675,651,229,89,918,605,447},
			{617,688,484,618,342,1284,1058,900,369},
			{256,231,525,532,805,284,607,524,701,873},
			{207,378,407,256,318,811,585,427,324,464,463},
			{354,525,332,457,272,908,795,637,319,263,610,201},
			{860,1031,1172,538,772,1118,644,535,683,1072,1026,799,995},
			{142,313,511,282,555,562,562,404,451,708,305,244,445,776},
			{640,615,909,817,1122,100,720,683,1018,1384,384,911,1008,1218,662},
			{363,353,166,534,438,868,829,671,485,335,584,278,166,1043,479,968},
			{309,480,621,173,459,563,396,238,355,721,396,248,458,667,486,663,492},
			{506,703,516,552,251,1140,939,781,323,219,856,433,232,1006,677,1240,350,690},
			{495,570,830,490,798,274,322,359,694,1060,355,587,797,905,406,374,831,339,1029},
			{264,415,228,435,376,804,730,572,423,367,520,179,104,944,380,904,99,393,336,732},
			{584,855,896,255,496,784,359,201,407,796,725,511,733,334,500,884,761,391,730,560,668},
			{515,490,802,558,866,156,464,427,762,1128,259,655,865,973,472,256,861,407,1097,118,779,628},
			{578,653,899,358,676,468,152,115,595,999,455,526,736,650,464,568,770,278,968,244,671,316,312},
			{762,933,1074,440,674,1020,546,437,585,974,928,696,897,98,678,1120,945,569,908,807,846,236,875,352},
			{251,422,563,115,401,621,395,237,297,663,417,190,400,609,167,721,434,58,632,397,335,333,465,336,511},
			{473,482,219,644,436,997,939,781,506,265,713,388,187,1153,615,1097,129,602,313,941,209,877,1009,880,1055,544},
			{150,75,219,516,675,590,796,638,654,613,306,357,444,1010,292,690,278,459,628,611,340,734,583,694,912,401,407},
			{772,943,1084,443,645,1027,605,447,556,945,938,699,921,175,689,1127,955,579,879,803,856,271,871,562,95,521,1065,922},
			{702,873,1014,373,614,902,304,322,525,914,868,641,851,340,618,1002,885,509,821,626,786,118,703,391,242,451,995,852,337},
			{491,662,803,168,461,669,244,86,372,761,596,424,640,450,407,769,674,298,695,442,575,130,513,201,352,240,784,641,361,248},
			{598,673,970,437,755,437,159,203,650,1070,458,597,807,738,535,537,841,349,1039,163,742,404,281,88,640,407,951,714,650,463,289},
			{874,1045,1186,545,747,1129,707,549,658,1047,1040,701,977,121,791,1229,1058,681,981,905,957,373,973,664,148,623,1153,1024,102,390,463,752},
			{463,634,763,97,299,778,395,237,210,599,629,353,529,473,379,878,631,270,533,554,532,197,622,352,375,212,756,613,346,315,162,440,448},
			{691,766,1032,475,768,529,119,232,679,1132,551,659,869,763,636,629,903,441,1101,255,804,433,373,169,665,469,1013,807,679,423,318,92,781,469},
			{644,815,956,369,662,693,108,156,573,1056,680,583,793,547,560,793,827,394,962,430,728,293,537,225,449,393,937,794,544,207,201,267,666,363,227},
			{338,509,650,67,385,650,355,197,296,750,504,277,497,560,254,750,521,145,619,426,422,245,494,299,462,87,631,488,467,363,158,370,569,164,429,359},
			{492,609,422,493,217,1046,993,775,264,125,762,339,138,947,583,1146,256,596,94,935,242,671,1003,874,849,538,219,534,820,789,636,945,922,474,1007,837,560},
			{473,548,794,261,579,453,257,141,490,894,383,421,631,676,359,553,665,173,863,229,566,342,297,105,578,231,775,589,574,463,213,176,676,325,268,297,194,769},
			{443,417,711,649,935,98,555,518,831,1059,186,649,796,1064,464,198,770,476,1029,209,707,719,91,403,966,534,899,492,962,835,604,372,1064,713,464,628,585,949,388},
			{242,317,577,417,703,409,488,372,599,873,152,397,596,907,153,509,605,244,842,253,506,573,319,336,809,302,715,385,805,694,444,356,907,514,449,528,389,748,231,311},
			{240,411,526,137,368,692,466,308,264,583,437,119,320,675,187,792,397,129,552,468,298,392,536,407,577,71,507,390,580,510,305,478,682,234,540,464,158,458,302,605,340},
			{191,166,460,467,716,349,633,517,636,808,65,398,545,961,220,449,519,410,791,398,455,685,324,481,863,352,648,241,873,803,592,501,975,564,594,673,439,697,376,251,145,372},
			{444,615,756,121,414,663,280,122,325,714,563,377,578,455,360,763,627,251,648,439,528,134,507,237,357,193,737,594,356,252,47,325,458,115,354,248,111,589,210,598,441,258,545},
			{602,739,914,357,650,530,66,114,561,1014,574,541,751,549,518,630,785,352,919,256,686,315,374,86,451,351,895,752,561,340,200,93,663,351,118,174,311,825,191,489,422,422,576,236},
			{499,670,811,159,361,759,376,218,272,661,665,415,616,411,415,859,682,306,595,535,583,135,603,333,313,248,792,649,284,253,143,421,386,62,450,344,182,536,306,694,537,296,600,96,332},
			{423,498,758,418,726,296,324,287,622,988,283,515,725,833,334,396,759,267,957,72,660,488,140,172,735,325,869,539,731,604,373,175,833,482,268,397,354,863,157,231,181,396,326,367,258,463}
	};

	private String ciudades[]=
		{"Albacete","Alicante","Almeria","Avila","Badajoz","Barcelona","Bilbao","Burgos","C�ceres","C�diz","Castell�n",
			"Ciudad Real","C�rdoba","A Coru�a","Cuenca","Gerona","Granada","Guadalajara","Huelva","Huesca","Jaen","Leon",
			"L�rida","Logro�o","Lugo","Madrid","M�laga","Murcia","Orense","Oviedo","Palencia","Pamplona","Pontevedra","Salamanca",
			"S. Sebasti�n","Santander","Segovia","Sevilla","Soria","Tarragona","Teruel","Toledo","Valencia","Valladolid","Vitoria","Zamora","Zaragoza"};




	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ventana() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCiudadDeOrigen = new JLabel("Ciudad de Origen");
		lblCiudadDeOrigen.setBounds(71, 11, 100, 14);
		contentPane.add(lblCiudadDeOrigen);

		JLabel lblCiudadDeDestino = new JLabel("Ciudad de Destino");
		lblCiudadDeDestino.setBounds(241, 11, 123, 14);
		contentPane.add(lblCiudadDeDestino);

		distTotal = new JTextField();
		distTotal.setBounds(50, 250, 374, 20);
		distTotal.setEditable(false);
		contentPane.add(distTotal);
		distTotal.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 57, 105, 104);
		scrollPane.setToolTipText("a");
		contentPane.add(scrollPane);

		JList list = new JList(ciudades);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(273, 57, 105, 104);
		scrollPane_1.setToolTipText("b");
		contentPane.add(scrollPane_1);

		JList listaDest = new JList(ciudades);
		listaDest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(listaDest);

		

		JButton btnCalcula = new JButton("Calcula");
		btnCalcula.setBounds(181, 197, 89, 23);
		contentPane.add(btnCalcula);
		
		JLabel lblM = new JLabel("");
		lblM.setIcon(new ImageIcon(Ventana.class.getResource("/ejemplo5/mapa-espana.jpg")));
		lblM.setBounds(0, 0, 509, 362);
		contentPane.add(lblM);
		btnCalcula.addActionListener(new ActionListener() 

		{
			public void actionPerformed(ActionEvent arg0)
			{
				int pos1=0;
				int pos2=0;
				int distTot=0;

				
				for(int f=0;f<ciudades.length;f++)
				{
					if(ciudades[f].equals(list.getSelectedValue()))
					{
						pos1=f;
					}
					if(ciudades[f].equals(listaDest.getSelectedValue()))
					{
						pos2=f;
					}
				}
				if(pos1>pos2)
				{
					distTot=distancias[pos1-1][pos2];

				}
				else
				{
					if(pos1!=pos2)
					{
						distTot=distancias[pos2-1][pos1];
					}
				}
				String a=(String) list.getSelectedValue();
				String b=(String)listaDest.getSelectedValue();
				
				if(pos1==pos2)
				{
					distTotal.setText("La Distancia Total entre "+a+" y "+b+" es de 0 Km");	
				}
				else
				{
					String ciud=Integer.toString(distTot);
					distTotal.setText("La Distancia Total entre "+a+" y "+b+" es de "+ciud+" Km");	
				}
			}
		});






	}
}
