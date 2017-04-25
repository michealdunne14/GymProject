package code;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GymApi {
	private StudentMember member;
	private Person person;
	
		ArrayList<Member> members;
		ArrayList<Trainer> trainers;
	public GymApi() {
		 members = new ArrayList<Member>();
		 trainers = new ArrayList<Trainer>();
	}
	public void addMember(Member member){
		members.add(member);
	}
	public void addTrainer(Trainer trainer){
		trainers.add(trainer);
	}
	public int numberOfMembers(){
		return members.size();
	}
	public int numberOfTrainers(){
		return trainers.size();
		
	}
	public ArrayList<Member> getMembers(){
		return members;
		
	}
	public ArrayList<Trainer> getTrainers(){
		return trainers;
		
	}
	public boolean isValidMemberIndex(int index){
		
		if (members.size() >= 1){
		return true;
		}
		else{ 
			return false;
		}
	}
	public boolean isValidTrainerIndex(int index){
		if (trainers.size() <=1){
			return true;
		}
		else {
		return false;
		}
	}
	public String searchMembersByEmail(String emailEntered){
		return person.internet;
	}
	public String searchTrainersByEmail(Person emailEntered){
		return person.internet;
	}
	public String listMembers(){
		{
			if (members.size() == 0)
			{
				return "No members.";
			}
			else
			{
				String listmembers = "";
				for (int i = 0; i < members.size(); i++)
				{
					listmembers = listmembers + (i + ":" + members.get(i)) + "\n";
				}
				return listmembers;
			}
		}
	}
	public String listMembersWithIdealWeight(){
			
		return listMembers();
		}
	public String listMembersBySpecificBMICategory(String category){
		return category;
	}
	public String listMemberDetailsImperialAndMetric(){
		return null;
	}
	public void load() throws Exception{
		{
	        XStream xstream = new XStream(new DomDriver());
	        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("products.xml"));
	        members = (ArrayList<Member>) is.readObject();
	        is.close();
	    }
	}
	public void store() throws Exception{
		{
	        XStream xstream = new XStream(new DomDriver());
	        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("products.xml"));
	        out.writeObject(members);
	        out.close();    
	    }
	}
}
