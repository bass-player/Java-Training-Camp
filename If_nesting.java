package if_nesting;

public class If_nesting {
    public static void main(String[] args) {
		int score = 94;
		String sex = "女";
        if (score>80){
            if (sex.equals("男")){
                System.out.println("进入男子组");
            } else {
                System.out.println("进入女子组");} 
        }else {
            System.out.println("没有进入决赛");
            }
        }
}
