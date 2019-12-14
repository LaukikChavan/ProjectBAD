package windows;

public class DataSh {
	
	public static double age,weight,bmi,pi,wi,r,x,y,bfp,bmr,lbm,height;
	public static boolean gender;
	public static String bmiStrSt, piStrSt, wiStrSt, bmrStrSt, bfpStrSt, lbmStrSt, bmiStrim, piStrim, wiStrim, bmrStrim, lbmStrim, bfpStrim;
	
	public static void setData(int hf, int hi , int w, int a, boolean g) {
		height = ((hf / 3.281) + (hi / 39.37));;
		weight = w;
		age = a;
		gender = g;
		
		System.out.println("Heigth :- " + Double.toString(height) + " M " );
		System.out.println("Weigth :- " + Double.toString(weight) + " Kg");
		System.out.println("Age :- " + Double.toString(age) + " yrs");
		System.out.println("Gender :- " + gender);
		
		SetDataPerfectly();
		
	}
	
	public static void SetDataPerfectly() {
		
		BMI();
		PI();
		waterIntake();
		BFP();
		BMR();
		LBM();
		
	}
	
	public static void BMI()
	{
		bmi = weight/(height*height);
		System.out.println("\nBody Mass Index(BMI): "+bmi);
		
		if(bmi < 18.5) {
            System.out.println("\nUnfortunately, you are Malnourished.");
            bmiStrSt = "Unfortunately, you are Malnourished.";
            
            bmiStrim = "Increase Your Weight; Choose nutrient-rich foods.";
            piStrim = "Get Quality Sleep; Include pre- and post-workout snacks.";
            wiStrim = "Drink More Water before Meals.";
            bmrStrim = "Drink Milk; Consume limited amounts of grains.";
            bfpStrim = "Fill up on lean protein.";
            lbmStrim = "Eat five to nine servings of fruits and vegetables. " ;
            
		}else if(bmi > 25) {
			System.out.println("\nUnfortunately, you are Overweight.");
            bmiStrSt = "Unfortunately, you are Overweight.";
            
            bmiStrim = "Increase Fibre Intake; Increase Protein Intake.";
            piStrim = "Decrease Your Weight; Eat More Fruits.";
            wiStrim = "Drink plenty of water.";
            bmrStrim = "Eat less Milk Products; Increase Your Vitamin D Levels'; Lower Your Calorie Intake.";
            bfpStrim = "Eat 4 to 5 small meals spaced 3 to 4 hours apart; Reduce your daily intake of liquid calories.";
            lbmStrim = "Avoid fatty foods and foods high in simple sugars; Lower Your Carbohydrates Intake." ;
            
		}else if(bmi >= 18.5 && bmi <= 25) {
            System.out.println("\nRejoice! You are perfectly healthy");
            bmiStrSt = "Rejoice! You are perfectly healthy.";
            
            bmiStrim = "NO Change";
            piStrim = "NO Change";
            wiStrim = "NO Change";
            bmrStrim = "NO Change";
            bfpStrim = "NO Change";
            lbmStrim = "NO Change";
            
		}else {
            System.out.println("\nSomething is Worng");
            bmiStrSt = "Something is Worng.";
		}
	}
	
	public static void PI()
	{
		pi = weight/(height*height*height);
		System.out.println("\nPonderal Index(PI): "+pi);
		if(pi<11)
		{
			System.out.println("\nYour Ponderal Index is Low."); 
			System.out.println("\nYour Ponderal Index should be in 11-15."); 
			r = 11-pi;
			r = Math.round(r);
			System.out.println("\nYou need "+r+" more to reach at healthy PI."); 
			piStrSt = "Your Ponderal Index is Low Your Ponderal Index should be in 11-15 You need "+r+" more to reach at healthy PI.";
		}
		if(pi>=11 && pi<=15)
		{
			System.out.println("\nRejoice! Your PI is perfectly healthy.");
			piStrSt = "Rejoice! Your PI is perfectly healthy.";
		}
		if(pi>15)
		{
			System.out.println("\nUnfortunately, your PI is Exceeding the Healthy PI Limit");
			piStrSt = "Unfortunately, your PI is Exceeding the Healthy PI Limit";
		}	
	}
	
	
	public static void waterIntake()
	{
		weight = weight*2.205;
		if(age<30)
		{
			x = weight/2.2*40;
		}
		if(age>30 && age<55)
		{
			x = weight/2.2*35;
		}
		if(age>55)
		{
			x = weight/2.2*30;
		}
		y = x/28.3;
		wi = y/8;
		wi = Math.round(wi);
		System.out.println("\nWater Intake should be Cups: "+wi);
		wiStrSt = "Water Intake should be Cups: " + wi + ".";
	}
	
	
	public static void BFP()
	{
		if(gender) {
			bfp = (1.20*bmi)+(0.23*age)-16.2;
			bfp = Math.round(bfp);
			System.out.println("\nBody Fat Percentage: "+bfp);
			bfpStrSt = "Body Fat Percentage: "+bfp;
			if(bfp>=2 && bfp<=5)
			{
				System.out.println("\nYou Falls in ESSENTIAL FAT Catogory");
				bfpStrSt += "; You Falls in ESSENTIAL FAT Catogory.";
			}
			if(bfp>=6 && bfp<=13)
			{
				System.out.println("\nYou Falls in ATHLETES Catogory");
				bfpStrSt += "; You Falls in ATHLETES Catogory.";
			}
			if(bfp>=14 && bfp<=17)
			{
				System.out.println("\nYou Falls in FITNESS Catogory");
				bfpStrSt += "; You Falls in FITNESS Catogory.";
			}
			if(bfp>=18 && bfp<=25)
			{
				System.out.println("\nYou Falls in Average Catogory");
				bfpStrSt += "; You Falls in Average Catogory.";
			}
			if(bfp>25)
			{
				System.out.println("\nYou Falls in OBESE Catogory");
				bfpStrSt += "; You Falls in OBESE Catogory.";
			}
		}else {
			bfp = 1.20*bmi+0.23*age-5.4;
			bfp = Math.round(bfp);
			System.out.println("\nBody Fat Percentage: "+bfp);
			bfpStrSt = "Body Fat Percentage: "+bfp;
			if(bfp>=10 && bfp<=13)
			{
				System.out.println("\nYou Falls in ESSENTIAL FAT Catogory");
				bfpStrSt += "; You Falls in ESSENTIAL FAT Catogory.";
			}
			if(bfp>=14 && bfp<=20)
			{
				System.out.println("\nYou Falls in ATHLETES Catogory");
				bfpStrSt += "; You Falls in ATHLETES Catogory.";
			}
			if(bfp>=21 && bfp<=24)
			{
				System.out.println("\nYou Falls in FITNESS Catogory");
				bfpStrSt += "; You Falls in FITNESS Catogory.";
			}
			if(bfp>=25 && bfp<=31)
			{
				System.out.println("\nYou Falls in Average Catogory");
				bfpStrSt += "; You Falls in Average Catogory.";
			}
			if(bfp>31)
			{
				System.out.println("\nYou Falls in OBESE Catogory");
				bfpStrSt += "; You Falls in OBESE Catogory.";
			}
		}
	}	

	public static void BMR()
	{
		if(gender) {
			bmr = (10*weight)+(6.25*height*100)-(5*age)+5;
			bmr = Math.round(bmr);
			System.out.println("\nBasal Metabolic Rate: "+bmr+" Calories");
			System.out.println("\nYour Calorie Intake should be 1500-3200");
			bmrStrSt = "Basal Metabolic Rate: "+bmr+"; Calories Your Calorie Intake should be 1500-3200; ";
			if(bmr>=1500 && bmr<=3200)
			{
				System.out.println("\nYour Calorie Intake is Perfect");
				bmrStrSt += " Your Calorie Intake is Perfect.";
			}
		}else {
			bmr = (10*weight)+(6.25*height*100)-(5*age)-161;
			bmr = Math.round(bmr);
			System.out.println("\nBasal Metabolic Rate: "+bmr+" Calories");
			System.out.println("\nYour Calorie Intake should be 1100-2550");
			bmrStrSt = "Basal Metabolic Rate: "+bmr+"; Calories Your Calorie Intake should be 1100-2550; ";
			if(bmr>=1100 && bmr<=2550)
			{
				System.out.println("\nYour Calorie Intake is Perfect");
				bmrStrSt += " Your Calorie Intake is Perfect.";
			}	
		}
	}	

	public static void LBM()
	{
		lbm = weight-bfp;
		System.out.println("\nMuscle Mass Percentage: "+lbm);
		lbm = Math.round(lbm);
		lbmStrSt = "Muscle Mass Percentage: " + lbm + " ; ";
		
		if(gender) {
			if(age>=18 && age<=40)
			{
				if(lbm<33.4)
				{
					System.out.println("\nYour Muscle Mass Percentage is LOW");
					lbmStrSt += "Your Muscle Mass Percentage is LOW.";
				}
				if(lbm>=33.5 && lbm<=39.4)
				{
					System.out.println("\nYour Muscle Mass Percentage is NORMAL");
					lbmStrSt += "Your Muscle Mass Percentage is NORMAL.";
				}
				if(lbm>=39.5 && lbm<=44.1)
				{
					System.out.println("\nYour Muscle Mass Percentage is HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is HIGH.";
				}
				if(lbm>=44.2)
				{
					System.out.println("\nYour Muscle Mass Percentage is VERY HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is VERY HIGH.";
				}
			}
			if(age>=41 && age<=60)
			{
				if(lbm<33.2)
				{
					System.out.println("\nYour Muscle Mass Percentage is LOW");
					lbmStrSt += "Your Muscle Mass Percentage is LOW.";
				}
				if(lbm>=33.5 && lbm<=39.2)
				{
					System.out.println("\nYour Muscle Mass Percentage is NORMAL");
					lbmStrSt += "Your Muscle Mass Percentage is NORMAL.";
				}
				if(lbm>=39.3 && lbm<=43.9)
				{
					System.out.println("\nYour Muscle Mass Percentage is HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is HIGH.";
				}
				if(lbm>=44)
				{
					System.out.println("\nYour Muscle Mass Percentage is VERY HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is VERY HIGH.";
				}
			}
			if(age>=61 && age<=80)
			{
				if(lbm<33)
				{
					System.out.println("\nYour Muscle Mass Percentage is LOW");
					lbmStrSt += "Your Muscle Mass Percentage is LOW.";
				}
				if(lbm>=33.1 && lbm<=38.7)
				{
					System.out.println("\nYour Muscle Mass Percentage is NORMAL");
					lbmStrSt += "Your Muscle Mass Percentage is NORMAL.";
				}
				if(lbm>=38.5 && lbm<=43.4)
				{
					System.out.println("\nYour Muscle Mass Percentage is HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is HIGH.";
				}
				if(lbm>=43.5)
				{
					System.out.println("\nYour Muscle Mass Percentage is VERY HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is VERY HIGH.";
				}
			}
		}else {
			if(age>=18 && age<=40)
			{
				if(lbm<24.4)
				{
					System.out.println("\nYour Muscle Mass Percentage is LOW");
					lbmStrSt += "Your Muscle Mass Percentage is LOW.";
				}
				if(lbm>=24.5 && lbm<=30.2)
				{
					System.out.println("\nYour Muscle Mass Percentage is NORMAL");
					lbmStrSt += "Your Muscle Mass Percentage is NORMAL.";
				}
				if(lbm>=30.3 && lbm<=35.2)
				{
					System.out.println("\nYour Muscle Mass Percentage is HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is HIGH.";
				}
				if(lbm>=35.3)
				{
					System.out.println("\nYour Muscle Mass Percentage is VERY HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is VERY HIGH.";
				}
			}
			if(age>=41 && age<=60)
			{
				if(lbm<24.2)
				{
					System.out.println("\nYour Muscle Mass Percentage is LOW");
					lbmStrSt += "Your Muscle Mass Percentage is LOW.";
				}
				if(lbm>=24.2 && lbm<=30.3)
				{
					System.out.println("\nYour Muscle Mass Percentage is NORMAL");
					lbmStrSt += "Your Muscle Mass Percentage is NORMAL.";
				}
				if(lbm>=30.4 && lbm<=35.3)
				{
					System.out.println("\nYour Muscle Mass Percentage is HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is HIGH.";
				}
				if(lbm>=35.4)
				{
					System.out.println("\nYour Muscle Mass Percentage is VERY HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is VERY HIGH.";
				}
			}
			if(age>=61 && age<=80)
			{
				if(lbm<24)
				{
					System.out.println("\nYour Muscle Mass Percentage is LOW");
					lbmStrSt += "Your Muscle Mass Percentage is LOW.";
				}
				if(lbm>=24.1 && lbm<=29.8)
				{
					System.out.println("\nYour Muscle Mass Percentage is NORMAL");
					lbmStrSt += "Your Muscle Mass Percentage is NORMAL.";
				}
				if(lbm>=29.9 && lbm<=34.8)
				{
					System.out.println("\nYour Muscle Mass Percentage is HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is HIGH.";
				}
				if(lbm>=35.9)
				{
					System.out.println("\nYour Muscle Mass Percentage is VERY HIGH");
					lbmStrSt += "Your Muscle Mass Percentage is VERY HIGH.";
				}
			}
		}
		
	}


}
