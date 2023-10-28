package StringProgram;

public class Practice {

	public static void main(String[] args) 
	{
		String str="sheela is a doctor";
	    char [] ch=str.toCharArray();
	    int fst=ch[0]-32;
	    ch[0]=(char)fst;  
	    for(int i=1;i<ch.length;i++)
	    {
	    	if(ch[i]==' ')
             {
	               int no=ch[i+1]-32;
	               ch[i+1]=(char)no;
             }
	    }
	    String s=new String(ch);
	    System.out.println(s);
	}

}
 