package Customer;

import java.util.Date;

public class Customer {
    
	private int Id;
	private static String Islem ; 
	private static String Tarih ; 
	private static String Id_customer;
    private static  String Isim;
    private static  String Evrak_Adi;
	private static String Ulke;
	private static String Dil;
	private static  String TLFN;
	private static String TRCM_TKP;
	private static String NTR;
	private static String KNS;
	private static String KYM_VALI;
	private static String KRYE_KARGO; 
	private static String TPLM ;
	private static String ALN;
	private static String KNL;
	private static String Yontem;
	
	
	
	public Customer(String Id_customer,String Tarih,String islem, String Isim ,String Evrak_Adi,  String ulke, String dil, String tLFN, String tRCM_TKP, String nTR, String kNS,
			String kYM_VALI, String kRYE_KARGO, String tPLM, String aLN, String kNL, String yontem) {
		super();
		Islem = islem;
		Tarih=Tarih;
		Id_customer=Id_customer;
		Isim= Isim; 
		Evrak_Adi= Evrak_Adi;
		Ulke = ulke;
		Dil = dil;
		TLFN = tLFN;
		TRCM_TKP = tRCM_TKP;
		NTR = nTR;
		KNS = kNS;
		KYM_VALI = kYM_VALI;
		KRYE_KARGO = kRYE_KARGO;
		TPLM = tPLM;
		ALN = aLN;
		KNL = kNL;
		Yontem = yontem;
	}







	public static String getTarih() {
		return Tarih;
	}







	public static void setTarih(String tarih) {
		Tarih = tarih;
	}







	public static String getEvrak_Adi() {
		return Evrak_Adi;
	}







	public static String getId_customer() {
		return Id_customer;
	}







	public static void setId_customer(String id_customer) {
		Id_customer = id_customer;
	}







	public static void setEvrak_Adi(String evrak_Adi) {
		Evrak_Adi = evrak_Adi;
	}







	public  String getIsim() {
		return Isim;
	}







	public static  void setIsim(String Isim) {
		Isim = Isim;
	}







	public static void setKRYE_KARGO(String kRYE_KARGO) {
		KRYE_KARGO = kRYE_KARGO;
	}







	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getIslem() {
		return Islem;
	}



	public static void setIslem(String islem) {
		Islem = islem;
	}



	


	public String getUlke() {
		return Ulke;
	}



	public static void setUlke(String ulke) {
		Ulke = ulke;
	}



	public String getDil() {
		return Dil;
	}



	public static void setDil(String dil) {
		Dil = dil;
	}



	public String getTLFN() {
		return TLFN;
	}



	public static void setTLFN(String tLFN) {
		TLFN = tLFN;
	}



	public String getTRCM_TKP() {
		return TRCM_TKP;
	}



	public static void setTRCM_TKP(String tRCM_TKP) {
		TRCM_TKP = tRCM_TKP;
	}



	public String getNTR() {
		return NTR;
	}



	public static void setNTR(String nTR) {
		NTR = nTR;
	}



	public String getKNS() {
		return KNS;
	}



	public static void setKNS(String kNS) {
		KNS = kNS;
	}



	public String getKYM_VALI() {
		return KYM_VALI;
	}



	public static void setKYM_VALI(String kYM_VALI) {
		KYM_VALI = kYM_VALI;
	}



	public String getKRYE_KARGO() {
		return KRYE_KARGO;
	}



	public static void setKRYE_KRGO(String kRYE_KARGO) {
		KRYE_KARGO = kRYE_KARGO;
	}



	public String getTPLM() {
		return TPLM;
	}



	public static void setTPLM(String tPLM) {
		TPLM = tPLM;
	}



	public String getALN() {
		return ALN;
	}



	public static void setALN(String aLN) {
		ALN = aLN;
	}



	public String getKNL() {
		return KNL;
	}



	public static void setKNL(String kNL) {
		KNL = kNL;
	}



	public String getYontem() {
		return Yontem;
	}



	public static void setYontem(String yontem) {
		Yontem = yontem;
	}







	@Override
	public String toString() {
		return "Customer [Id=" + Id + "]";
	}







	





	



	
	
	
	
	
	
	
}
