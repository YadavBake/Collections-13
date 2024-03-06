import java.util.*;
  class TreeMapDemo3
  {
		public static void main(String args[])
		{
			TreeMap m = new TreeMap();
			m.put(100,"ZZZ");
			m.put(103,"YYY");
			m.put(101,"XXX");
			m.put(104,106);
			//m.put(null,null);
			//m.put("FFFF","XXX");//CCE
			//m.put(null,"XXX");//NPE
			System.out.println(m); //{100=ZZZ, 101=XXX, 103=YYY, 104=106}
		}
  }