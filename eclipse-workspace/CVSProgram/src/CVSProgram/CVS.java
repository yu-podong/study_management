package CVSProgram;
import java.util.*;

public class CVS {
	public static void main(String args[])
	{
		new Service().serviceInfo();
	}
	

}

//재고관리
class Stock {
	private String title; // 상품 정보
	private int price; // 상품 가격
	private int amount; // 상품 수량
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount=amount;
	}
	
	@Override
	public String toString()
	{
		return "Shopping[title="+title+", price="+price+", amount="+amount+"]";
	}
	
}

//기능수행메소드집합
class Service {
	Scanner info = new Scanner(System.in);
	Check ch = Check.getInstance();
	int info1, info2, info3, info4;
	
	public void serviceInfo() {
		System.out.println("필요한 기능을 입력하시오.");
		System.out.println("1. 입고");
		System.out.println("2. 판매");
		System.out.println("3. 환불");
		System.out.println("4. 재고확인");
		System.out.print("입력:");
		int info1 = info.nextInt();
		
		if(info1 == 1)
		{
			storeService();
		}
		
		else if(info1 == 2)
		{
			sellService();
		}
		
		else if(info1 == 3)
		{
			refundService();
		}
		
		else if(info1 == 4)
		{
			stockCheck();
		}
	}
	
	public void storeService() {
		do {
			int info1 = info.nextInt();
			System.out.println("각 항목들을 입력하시오.");
			System.out.println("상품 정보: ");
			String goodsInfo = info.next();
			
			System.out.println("상품 가격: ");
			int price = info.nextInt();
			
			System.out.println("상품 수량: ");
			int amount = info.nextInt();
		}while(info1!=0);
		
		ch.add(title, int price, int amount);
	}
	
	public void sellService() {

	}
	
	public void refundService() {
		
		
	}
	
	public void stockCheck() {
		
		
	}
	
class Check {
	private static Check instance;
	public static Check getInstance() {
		if(instance ==null)
			instance = new Check();
		return instance;
	}
	
	
	private Service[] ser;
	private int MAX_SIZE = 100;
	private int idx;
	
	private Check() {
		ser = new Service[MAX_SIZE];
		idx=0;
	}
	
	public void add(String title,int price,int amount) {
		Stock s = new Stock();
		s.setTitle(title);
		s.setPrice(price);
		s.setAmount(amount);
		ser[idx++]=s;
	}
	
	public void list() {
		for(int i=0;i<idx;i++)
			System.out.println(ser[i]);
		
	}
	
}



}