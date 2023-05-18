//Develop any distributed application using CORBA to demonstrate object brokering.             
// (Calculator or String operations). 
//SATYAM PARKALE
//4246
import ReverseModule.ReversePOA; import java.lang.String;
class ReverseImpl extends ReversePOA
{
ReverseImpl()
{
super();
System.out.println("Reverse Object Created");
}

public String reverse_string(String name)
{
StringBuffer str=new StringBuffer(name); str.reverse();
return (("Server Send "+str));
}
}
