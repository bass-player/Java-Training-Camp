package switch_case;

public class Switch_case {
	public static void main(String[] args) {
		char today='一';
		switch(today){
		    case '一':
		    case '三':
		    case '五':
		        System.out.println("吃包子");
		        break;
		    case '二':
		    case '四':
		    case '六':
		        System.out.println("吃油条");
		        break;
		    default:
		        System.out.println("吃主席套餐");
		        break;
		} 
	}
}
