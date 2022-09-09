package day18_garbageCollection;

public class Contact {
    String name;
    long phoneNumber;
    String email;

    public static void main(String[] args) {

        Contact c=new Contact();
        c.setInfo("AHMET",5552342323L,"abc@gmail.com");
        c.call();
        c.sendMessage();
        c.senEmail();
    }

    public void setInfo(String name,long phoneNumber,String email){
        this.email=email;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public void call(){
        System.out.println("Calling " + name + " now");
    }

    public void sendMessage(){
        System.out.println("Sending message to " + phoneNumber + " now");
    }

    public void senEmail(){
        System.out.println("Sending email to " + email + " now");
    }

}
/*
2. Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"


 */