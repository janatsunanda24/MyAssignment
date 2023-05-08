package week1day2;

public class mobile {
	String mobileBrandName="Asus";
	char mobileLogo='L';
	short noOfMobilePiece=12;
	int modelNumber=124;
	long mobilemeiNumber=34567826514238909L;
	float mobilePrice=25500.50F;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
    mobile asus=new mobile();
    System.out.println(asus.mobileBrandName);
    System.out.println(asus.mobileLogo); 
    System.out.println(asus.noOfMobilePiece);
    System.out.println(asus.modelNumber);
    System.out.println(asus.mobilemeiNumber);
    System.out.println(asus.mobilePrice);
    System.out.println(asus.isDamaged);
    
    
	}

}
