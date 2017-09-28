import java.util.*;

public class Prob02 
{
	//public List<String> dataChange(String[] strData){
		public Vector<String> dataChange(String[] strData){
		//List<String> v = new Vector<String>();
		Vector<String> v = new Vector<String>();
		for(int i=0; i<strData.length; i++){
			//v.add(0, new StringBuffer(strData[i]).reverse().toString()) ;
			v.insertElementAt(new StringBuffer(strData[i]).reverse().toString(), 0);
		}

		return v;
	}

	public static void main(String[] args) 
	{
		String str = new String("JAVA");
		Prob02 st = new Prob02();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		//List<String> v = st.dataChange(strData);
		Vector<String> v = st.dataChange(strData);

		for(int i=0; i<v.size(); i++){
			//System.out.println( v.get(i) );
			System.out.println(v.elementAt(i));
		}

		System.out.println(str);
	}
}
