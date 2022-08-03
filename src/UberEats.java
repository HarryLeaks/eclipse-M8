import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UberEats extends JFrame{
	private static final long serialVersionUID = 1L;
	
	//Components
	private JFrame window;
	private JPanel panel1;
	private JPanel panel2;
	
	private ImageIcon JFrameIcon = new ImageIcon("src/img/icon.png");
	private ImageIcon UberEatsVideo = new ImageIcon("src/img/gifIntro.gif");
	private ImageIcon ImageCart = new ImageIcon("src/img/cartButton.gif");
	private ImageIcon GifCart = new ImageIcon("src/img/gifCart.gif");
	private ImageIcon addToCartImage = new ImageIcon("src/img/addToCart.png");
	
	private JLabel labelIntro = new JLabel(UberEatsVideo);
	private JLabel titleInfo, titleOrder;
	private JLabel nome, idade, morada, numero, BI;
	private JTextField tfNome, tfIdade, tfNumero, tfMorada;
	
	private Font ft;
	private JSeparator sp;
	
	private JButton btnCart;
	private JScrollPane scrollPane;
	private DefaultListModel<String> model = new DefaultListModel<>();
	private JList<String> foodList;
	private JLabel imgFoodLabel;
	private int[] listElements = {0, 6, 7, 13, 14, 20, 21, 27, 28, 34, 35, 41, 42, 48, 49, 55, 56, 62, 63, 69, 70}; //elements that will be used for interaction list and image
 	
	private JButton addToCart;
	private JProgressBar order;
	private JComboBox<String> Pay = new JComboBox<String>();
	private JLabel labelQuantity, payMethod = new JLabel("Do you want to pay by card?");
	private JSlider Quantity;
	private JLabel time;
	private LocalDate date;
	
	private JFileChooser chooser;	
	private FileNameExtensionFilter filter;
	
	//RadioButton
	private JLabel Size = new JLabel("Size:");
	private JRadioButton pequeno = new JRadioButton("Small");
	private JRadioButton medio = new JRadioButton("Average");
	private JRadioButton grande = new JRadioButton("Big");
	private ButtonGroup tamanho = new ButtonGroup();
	
	//Menu
	private JMenuBar menuBar;
	private JMenu tiposComida;
	private JMenu burgers;
	private JMenu sushi;
	private JMenu ramen;
	private JMenu breakfast;
	private JMenu newMexican;
	private JMenu sandwiches;
	private JMenu mediterranean;
	private JMenu italian;
	private JMenu japanese;
	private JMenu bar;
	
	private JMenuItem exit;
	private JMenuItem aboutUs;
	private JMenuItem help;
	
	private JMenuItem[] BurgersFoods = new JMenuItem[5];
	private JMenuItem[] SushiFoods  = new JMenuItem[5];
	private JMenuItem[] RamenFoods = new JMenuItem[5];
	private JMenuItem[] BreakfastFoods = new JMenuItem[5];
	private JMenuItem[] NewMexicanFoods = new JMenuItem[5];
	private JMenuItem[] SandwichesFoods = new JMenuItem[5];;
	private JMenuItem[] MediterraneanFoods = new JMenuItem[5];;
	private JMenuItem[] ItalianFoods = new JMenuItem[5];;
	private JMenuItem[] JapaneseFoods = new JMenuItem[5];;
	private JMenuItem[] BarFoods = new JMenuItem[5];;
	
	//images
	private ImageIcon[] BurgersImage = {
			new ImageIcon("src/food/Burgers/1.jpg"), 
			new ImageIcon("src/food/Burgers/2.jpg"), 
			new ImageIcon("src/food/Burgers/3.jpg"), 
			new ImageIcon("src/food/Burgers/4.jpg"), 
			new ImageIcon("src/food/Burgers/5.jpg")};
	private ImageIcon[] SushiImage = {
			new ImageIcon("src/food/Sushi/1.jpg"), 
			new ImageIcon("src/food/Sushi/2.jpg"),
			new ImageIcon("src/food/Sushi/3.jpg"),
			new ImageIcon("src/food/Sushi/4.jpg"),
			new ImageIcon("src/food/Sushi/5.jpg")};
	private ImageIcon[] RamenImage = {
			new ImageIcon("src/food/Ramen/1.jpg"), 
			new ImageIcon("src/food/Ramen/2.jpg"), 
			new ImageIcon("src/food/Ramen/3.jpg"),
			new ImageIcon("src/food/Ramen/4.jpg"),
			new ImageIcon("src/food/Ramen/5.jpg")};
	private ImageIcon[] BreakfastImage = {
			new ImageIcon("src/food/Breakfast/1.jpg"),
			new ImageIcon("src/food/Breakfast/2.jpg"),
			new ImageIcon("src/food/Breakfast/3.jpg"),
			new ImageIcon("src/food/Breakfast/4.jpg"),
			new ImageIcon("src/food/Breakfast/5.jpg")};
	private ImageIcon[] NewMexicanImage  = {
			new ImageIcon("src/food/NewMexican/1.jpg"),
			new ImageIcon("src/food/NewMexican/2.jpg"), 
			new ImageIcon("src/food/NewMexican/3.jpg"),
			new ImageIcon("src/food/NewMexican/4.jpg"), 
			new ImageIcon("src/food/NewMexican/5.jpg")};
	private ImageIcon[] SandwichesImage = {
			new ImageIcon("src/food/Sandwiches/1.jpg"), 
			new ImageIcon("src/food/Sandwiches/2.jpg"), 
			new ImageIcon("src/food/Sandwiches/3.jpg"), 
			new ImageIcon("src/food/Sandwiches/4.jpg"),
			new ImageIcon("src/food/Sandwiches/5.jpg")};
	
	private ImageIcon[] MediterraneanImage = {
			new ImageIcon("src/food/Mediterranean/1.jpg"),
			new ImageIcon("src/food/Mediterranean/2.jpg"),
			new ImageIcon("src/food/Mediterranean/3.jpg"),
			new ImageIcon("src/food/Mediterranean/4.jpg"),
			new ImageIcon("src/food/Mediterranean/5.jpg")};
	
	private ImageIcon[] ItalianImage = {
			new ImageIcon("src/food/Italian/1.jpg"),
			new ImageIcon("src/food/Italian/2.jpg"),
			new ImageIcon("src/food/Italian/3.jpg"),
			new ImageIcon("src/food/Italian/4.jpg"),
			new ImageIcon("src/food/Italian/5.jpg")};
	
	private ImageIcon[] JapaneseImage = {
			new ImageIcon("src/food/Japanese/1.jpg"),
			new ImageIcon("src/food/Japanese/2.jpg"),
			new ImageIcon("src/food/Japanese/3.jpg"),
			new ImageIcon("src/food/Japanese/4.jpg"), 
			new ImageIcon("src/food/Japanese/5.jpg")};
	
	private ImageIcon[] BarImage = {
			new ImageIcon("src/food/barFood/1.jpg"),
			new ImageIcon("src/food/barFood/2.jpg"),
			new ImageIcon("src/food/barFood/3.jpg"),
			new ImageIcon("src/food/barFood/4.jpg"),
			new ImageIcon("src/food/barFood/5.jpg")};
	
	private String[] typeBurgers = {"The Harbord", "Marben", "The Stockyards", "NotaBene", "HolyChuck"};
	private String[] typeSushi = {"Sake", "Maguro", "Ebi", "Tai", "Tako"};
	private String[] typeRamen = {"Hida Takayama", "Kagoshima", "Banshu", "Akayu", "Abura-Soba"};
	private String[] typeBreakfast = {"Continental", "American", "English", "Italian", "Indonesian"};
	private String[] typeNewMexican = {"Green Chile", "Carne Adovada", "Huevos Rancheros", "Tortillas", "Posole"};
	private String[] typeSandwiches = {"Tortas", "Panini", "Grilled Cheese", "Club Sandwich", "Piadina Romagnola"};
	private String[] typeMediterranean = {"Chicken Shawarma", "Easy Seafood Paella", "Spanakopita", "Chicken Souvlaki", "Briam"};
	private String[] typeItalian = {"Lasagna", "Spaghetti", "Ravioli", "Ciabatta", "Pizza"};
	private String[] typeJapanese = {"Makizushi", "Miso Soup", "Yakitori", "Tempura", "Edamame"};
	private String[] typeBar = {"French fries", "Nachos", "Wings", "Quesadillas", "Burger Sliders"};
	
	private String[][] foodsList = {
			{"The Harbord", "Marben", "The Stockyards", "NotaBene", "HolyChuck"}, 
			{"Sake", "Maguro", "Ebi", "Tai", "Tako"},
			{"Hida Takayama", "Kagoshima", "Banshu", "Akayu", "Abura-Soba"},
			{"Continental", "American", "English", "Italian", "Indonesian"},
			{"Green Chile", "Carne Adovada", "Huevos Rancheros", "Tortillas", "Posole"}, 
			{"Tortas", "Panini", "Grilled Cheese", "Club Sandwich", "Piadina Romagnola"},
			{"Chicken Shawarma", "Easy Seafood Paella", "Spanakopita", "Chicken Souvlaki", "Briam"},
			{"Lasagna", "Spaghetti", "Ravioli", "Ciabatta", "Pizza"},
			{"Makizushi", "Miso Soup", "Yakitori", "Tempura", "Edamame"},
			{"French fries", "Nachos", "Wings", "Quesadillas", "Burger Sliders"}};
	
	private String []typesFood = {"Burgers" , "Sushi", "Ramen", "Breakfast", "NewMexican", "Sandwiches", "Mediterranean", "Italian", "Japanese", "barFood"};
	
	public void Window() {
		//create objects
		window = new JFrame();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("UberEats");
		window.setSize(600, 800);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.add(panel1);
		window.add(panel2);
		panel1.setLayout(null);
		panel2.setLayout(null);
		window.setIconImage(JFrameIcon.getImage());
		
		menuBar = new JMenuBar();
		tiposComida = new JMenu("Options");
		burgers = new JMenu("Burgers");
		sushi = new JMenu("Sushi");
		ramen = new JMenu("Ramen");
		breakfast = new JMenu("Breakfast");
		newMexican = new JMenu("NewMexican");
		sandwiches = new JMenu("Sandwiches");
		mediterranean = new JMenu("Mediterranean");
		italian = new JMenu("Italian");
		japanese = new JMenu("Japanese");
		bar = new JMenu("barFood");
		
		exit = new JMenuItem("Exit");
		exit.setToolTipText("Exit App");
		help = new JMenuItem("Need Help?");
		help.setToolTipText("Help");
		aboutUs = new JMenuItem("About us");
		aboutUs.setToolTipText("About us");
		
		//add items to menu
		for(int i = 0; i < 5; i++) {
			BurgersFoods[i] = new JMenuItem(typeBurgers[i]);
			burgers.add(BurgersFoods[i]);
			
			SushiFoods[i] = new JMenuItem(typeSushi[i]);
			sushi.add(SushiFoods[i]);
			
			RamenFoods[i] = new JMenuItem(typeRamen[i]);
			ramen.add(RamenFoods[i]);
			
			BreakfastFoods[i] = new JMenuItem(typeBreakfast[i]);
			breakfast.add(BreakfastFoods[i]);
			
			NewMexicanFoods[i] = new JMenuItem(typeNewMexican[i]);
			newMexican.add(NewMexicanFoods[i]);
			
			SandwichesFoods[i] = new JMenuItem(typeSandwiches[i]);
			sandwiches.add(SandwichesFoods[i]);
			
			MediterraneanFoods[i] = new JMenuItem(typeMediterranean[i]);
			mediterranean.add(MediterraneanFoods[i]);
			
			ItalianFoods[i] = new JMenuItem(typeItalian[i]);
			italian.add(ItalianFoods[i]);
			
			JapaneseFoods[i] = new JMenuItem(typeJapanese[i]);
			japanese.add(JapaneseFoods[i]);
			
			BarFoods[i] = new JMenuItem(typeBar[i]);
			bar.add(BarFoods[i]);
		}

		tiposComida.add(burgers);
		tiposComida.add(sushi);
		tiposComida.add(ramen);
		tiposComida.add(breakfast);
		tiposComida.add(newMexican);
		tiposComida.add(sandwiches);
		tiposComida.add(mediterranean);
		tiposComida.add(italian);
		tiposComida.add(japanese);
		tiposComida.add(bar);
		tiposComida.addSeparator();
		tiposComida.add(help);
		tiposComida.add(aboutUs);
		tiposComida.add(exit);
		
		menuBar.add(tiposComida);
		window.setJMenuBar(menuBar);
		
		//add to panel1
		panel1.setBounds(0, 0, 600, 100);
		panel1.setOpaque(true);
		panel1.setBackground(new Color(255, 255, 255));
		labelIntro.setBounds(0, 0, 600, 100);
		panel1.add(labelIntro);
		
		panel2.setBounds(0, 110, 600, 690);
		panel2.setOpaque(true);
		panel2.setBackground(new Color(255, 255, 255));
		
		ft = new Font("Arial", Font.BOLD, 20);
		titleInfo = new JLabel("Provide Your Information");
		titleInfo.setFont(ft);
		titleInfo.setBounds(160, 95, 240, 60);
		
		nome = new JLabel("Name: ");
		nome.setBounds(20, 140, 100, 30);
		tfNome = new JTextField();
		tfNome.setBounds(70, 145, 130, 20);
		
		idade = new JLabel("Age: ");
		idade.setBounds(20, 170, 100, 30);
		tfIdade = new JTextField();
		tfIdade.setBounds(70, 175, 130, 20);
		
		morada = new JLabel("Street: ");
		morada.setBounds(320, 140, 100, 30);
		tfMorada = new JTextField();
		tfMorada.setBounds(375, 145, 130, 20);
		
		numero = new JLabel("Number: ");
		numero.setBounds(320, 170, 100, 30);
		tfNumero = new JTextField();
		tfNumero.setBounds(375, 175, 130, 20);
		
		BI = new JLabel("Citizen card:");
		BI.setBounds(20, 195, 200, 30);
		chooser = new JFileChooser();
		filter = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg", "gif", "png");
		chooser.setFileFilter(filter);
		chooser.setBounds(40, 210, 500, 220);
		
		sp = new JSeparator();
		sp.setOrientation(SwingConstants.HORIZONTAL);
		sp.setForeground(new Color(0, 0, 0));
		sp.setBounds(0, 430, 600, 70);
		
		titleOrder = new JLabel("Place your Order");
		titleOrder.setFont(ft);
		titleOrder.setBounds(220, 435, 200, 30);
		
		btnCart = new JButton(ImageCart);
		btnCart.setRolloverIcon(GifCart);
		//btnCart.setBorder(BorderFactory.createEmptyBorder());
		btnCart.setBorderPainted(false);
		btnCart.setContentAreaFilled(false);
		btnCart.setBounds(505, 435, 60, 60);
		
		foodList = new JList<>(model);
		for(int i = 0; i < 10; i++) {
			model.addElement((i+1) + ": "+ typesFood[i]);
			for(int k = 0; k < 5; k++) { 
				model.addElement(foodsList[i][k]);
			}
			model.addElement(" ");
		}
		
		foodList.setBounds(20, 470, 150, 150);
		foodList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane = new JScrollPane(foodList);
		scrollPane.setBounds(20, 470, 150, 150);
		
		imgFoodLabel = new JLabel(new ImageIcon("src/img/chooseFood.gif"));
		imgFoodLabel.setBounds(190, 470, 170, 150);
		
		labelQuantity = new JLabel("Quantity: ");
		labelQuantity.setBounds(10, 625, 100, 30);
		
		Quantity = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
		Quantity.setMinorTickSpacing(1);
		Quantity.setMajorTickSpacing(5);
		Quantity.setPaintTicks(true);
		Quantity.setPaintLabels(true);
		Quantity.setBounds(10, 650, 200, 50);
		
		Size.setBounds(380, 430, 100, 100);
		
		pequeno.setBounds(385, 495, 80, 20);
		medio.setBounds(385, 515, 80, 20);
		grande.setBounds(385, 535, 80, 20);
		pequeno.setBorderPainted(false);
		medio.setBorderPainted(false);
		grande.setBorderPainted(false);
		pequeno.setContentAreaFilled(false);
		medio.setContentAreaFilled(false);
		grande.setContentAreaFilled(false);
		
		tamanho.add(pequeno);
		tamanho.add(medio);
		tamanho.add(grande);
		
		payMethod.setBounds(385, 580, 200, 20);
		Pay.setBounds(390, 610, 115, 20);
		Pay.addItem("Choose option");
		Pay.addItem("Yes");
		Pay.addItem("No");
		
		addToCart = new JButton(addToCartImage);
		addToCart.setBounds(260, 670, 130, 28);
		addToCart.setEnabled(false);
		order = new JProgressBar();
		order.setBounds(260, 700, 130, 20);
		order.setValue(0);
		order.setStringPainted(true);
		
		date = LocalDate.now();
		time = new JLabel(date.toString());
		time.setBounds(505, 690, 100, 20);
		
		//add to panel2
		panel2.add(titleInfo);
		panel2.add(nome);
		panel2.add(tfNome);
		panel2.add(idade);
		panel2.add(tfIdade);
		panel2.add(morada);
		panel2.add(tfMorada);
		panel2.add(numero);
		panel2.add(tfNumero);		
		panel2.add(BI);
		panel2.add(chooser);
		
		panel2.add(sp);
		
		panel2.add(titleOrder);
		panel2.add(btnCart);
		panel2.add(scrollPane);
		panel2.repaint();
		panel2.add(imgFoodLabel);
		panel2.add(labelQuantity);
		panel2.add(Quantity);
		panel2.add(Size);
		panel2.add(pequeno);
		panel2.add(medio);
		panel2.add(grande);
		panel2.add(payMethod);
		panel2.add(Pay);
		panel2.add(addToCart);
		panel2.add(order);
		panel2.add(time);
		
		window.setVisible(true);
	}
	
	public int getIndex() {
		for(int i = 0; i < 21; i++) {
			if(foodList.getSelectedIndex() == listElements[i]) {
				foodList.setSelectedIndex(-1);
				return -1;
			}
		}
		return foodList.getSelectedIndex();
	}
	
	//verify the list index to set the image
	public void setImage(int index) {
		if(index < 6) {
			if(index == 1)
				index = 0;
			else if(index == 2)
				index = 1;
			else if(index == 3)
				index = 2;
			else if(index == 4)
				index = 3;
			else if(index == 5)
				index = 4;
			imgFoodLabel.setIcon(BurgersImage[index]);
		}else if(index < 13) {
			if(index == 8)
				index = 0;
			else if(index == 9)
				index = 1;
			else if(index == 10)
				index = 2;
			else if(index == 11)
				index = 3;
			else if(index == 12)
				index = 4;
			imgFoodLabel.setIcon(SushiImage[index]);
		}else if(index < 20) {
			if(index == 15)
				index = 0;
			else if(index == 16)
				index = 1;
			else if(index == 17)
				index = 2;
			else if(index == 18)
				index = 3;
			else if(index == 19)
				index = 4;
			imgFoodLabel.setIcon(RamenImage[index]);
		}else if(index < 27) {
			if(index == 22)
				index = 0;
			else if(index == 23)
				index = 1;
			else if(index == 24)
				index = 2;
			else if(index == 25)
				index = 3;
			else if(index == 26)
				index = 4;
			imgFoodLabel.setIcon(BreakfastImage[index]);
		}else if(index < 34) {
			if(index == 29)
				index = 0;
			else if(index == 30)
				index = 1;
			else if(index == 31)
				index = 2;
			else if(index == 32)
				index = 3;
			else if(index == 33)
				index = 4;
			imgFoodLabel.setIcon(NewMexicanImage[index]);
		}else if(index < 41) {
			if(index == 36)
				index = 0;
			else if(index == 37)
				index = 1;
			else if(index == 38)
				index = 2;
			else if(index == 39)
				index = 3;
			else if(index == 40)
				index = 4;
			imgFoodLabel.setIcon(SandwichesImage[index]);
		}else if(index < 48) {
			if(index == 43)
				index = 0;
			else if(index == 44)
				index = 1;
			else if(index == 45)
				index = 2;
			else if(index == 46)
				index = 3;
			else if(index == 47)
				index = 4;
			imgFoodLabel.setIcon(MediterraneanImage[index]);
		}else if(index < 55) {
			if(index == 50)
				index = 0;
			else if(index == 51)
				index = 1;
			else if(index == 52)
				index = 2;
			else if(index == 53)
				index = 3;
			else if(index == 54)
				index = 4;
			imgFoodLabel.setIcon(ItalianImage[index]);
		}else if(index < 62) {
			if(index == 57)
				index = 0;
			else if(index == 58)
				index = 1;
			else if(index == 59)
				index = 2;
			else if(index == 60)
				index = 3;
			else if(index == 61)
				index = 4;
			imgFoodLabel.setIcon(JapaneseImage[index]);
		}else if(index < 69) {
			if(index == 64)
				index = 0;
			else if(index == 65)
				index = 1;
			else if(index == 66)
				index = 2;
			else if(index == 67)
				index = 3;
			else if(index == 68)
				index = 4;
			imgFoodLabel.setIcon(BarImage[index]);
		}
		System.out.println();
	}
	
	//getters and setters
	public int getOrderValue() {
		return order.getValue();
	}
	
	public void addOrderValue(int num) {
		order.setValue(order.getValue() + num);
	}
	
	public void setButtonEnable() {
		addToCart.setEnabled(true);
	}
	
	public void setButtonDisable() {
		addToCart.setEnabled(false);
	}
	
	public int getSlideValue() {
		return Quantity.getValue();
	}
	
	public boolean getIsEnabled() {
		if(pequeno.isSelected() || medio.isSelected() || grande.isSelected()) {
			return true;
		}
		return false;
	}
	
	public boolean getComboChanged() {
		if(Pay.getSelectedIndex() != 0 && Pay.getSelectedIndex() != -1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		boolean orderChanged = false, quantityChanged = false, EnabledChanged = false, ComboChanged = false;
		
		UberEats win = new UberEats();
		win.Window();
		
		while(true) {
			System.out.println();
			if(win.getIndex() != -1) {
				win.setImage(win.getIndex());
				if(orderChanged == false) {
					win.addOrderValue(25);
					orderChanged = true;
				}
			}
			
			if(quantityChanged == false && win.getSlideValue() != 0) {
				win.addOrderValue(25);
				quantityChanged = true;
			}else if(quantityChanged == true && win.getSlideValue() == 0) {
				win.addOrderValue(-25);
				quantityChanged = false;
			}
			
			if(EnabledChanged == false && win.getIsEnabled() == true) {
				win.addOrderValue(25);
				EnabledChanged = !EnabledChanged;
			}
			
			
			if(ComboChanged == false && win.getComboChanged() == true) {
				win.addOrderValue(25);
				ComboChanged = true;
			}else if(ComboChanged == true && win.getComboChanged() == false) {
				win.addOrderValue(-25);
				ComboChanged = false;
			}
			
			if(win.getOrderValue() == 100) {
				win.setButtonEnable();
			}else {
				win.setButtonDisable();
			}
		}
	}
}
