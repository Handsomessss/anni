package anni.test;

public class sqlTest {
	public static void main(String[] args) {
		
//		for(int i = 1;i<200;i++)
//		{
//			System.out.println("INSERT INTO `custom` VALUES ("+i+",'custom"+i+"', '男', "+(i+100)+");");
//		}
		
//		for(int i = 1;i<50;i++)
//		{
//			System.out.println("INSERT INTO `task` VALUES ("+i+",'task"+i+"',"+(100+i)+","+(10+i)+","+(30+1)+");");
//		}
//		for(int i = 1;i<200;i++)
//		{
//			System.out.println("INSERT INTO `doctor` VALUES ("+i+",'zhangsan"+i+"','男',"+(1000000+i)+",'faff', 'fasfasf');");
//		}
		for(int i = 1;i<500;i++)
		{
			int t = i;
			int c= i;
			int d= i;
			if(i>=49) t=49;
			if(i>=199) d=199;
			if(i>=199) c=199;
			System.out.println("INSERT INTO `subscribe` VALUES ("+i+","+ c+","+d+","+t+","+1+", now(),"+i+");");
		}
	}
}
