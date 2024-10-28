/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SunsetCafeProgram;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SunsetCafe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total=0.00;
        String voucher="empty";
        String detailInfo="empty";
        welcomeCafe();
        
        String order=scan.nextLine();
        while(order.equalsIgnoreCase("yes")){
            menuList();
            int cname=Integer.parseInt(scan.nextLine());
            
            if(cname>0 && cname<6){
                if(cname<3){
//              For Espresso(Hot or Cold & Cup size)
                    if(cname==1){
                        System.out.println("\nHot  - 3000.00 Ks"
                                         + "\nCold - 3600.00 Ks");
                        System.out.print("Please enter a text as 'Hot' or 'Cold': ");
                        String type=scan.nextLine();
                        
                        if(type.equalsIgnoreCase("hot")){
                            voucher="\nEspresso"+"\t Hot"+"\t\t\t 3000.00 Ks";
                            total=3000.00;
                            
                            System.out.println("The cup size of Espresso is only available for medium.");
                            voucher=voucher+"\n\t\t Medium"+"\t\t\t 500.00 Ks";
                            total=total+500.00;    
                        }
                        else if(type.equalsIgnoreCase("cold")){
                            voucher="\nEspresso"+"\t Cold"+"\t\t\t 3600.00 Ks";
                            total=3600.00;
                            
                            System.out.println("The cup size of Espresso is only available for medium.");
                            voucher=voucher+"\n\t\t Medium"+"\t\t\t 500.00 Ks";
                            total=total+500.00; 
                        }
                        else{
                            System.out.println("\nThere is a typing error. "
                                    + "Please be careful that your input data must be 'Hot' and 'Cold'.");
                            System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                            order=scan.nextLine();
                        }
                    }
//              For Americano(Hot or Cold+Size)                    
                    else{
                        System.out.println("\nHot  - 3000.00 Ks"
                                         + "\nCold - 3500.00 Ks");
                        System.out.print("\nPlease enter a text as 'Hot' or 'Cold': ");
                        String type=scan.nextLine();
                        
                        if(type.equalsIgnoreCase("hot")){
                            voucher="\nAmericano"+"\t Hot"+"\t\t\t 3000.00 Ks";
                            total=3000.00;
                            
                            System.out.println("\nThe cup size of Americano is only available for medium.");
                            voucher=voucher+"\n\t\t Medium"+"\t\t\t 500.00 Ks";
                            total=total+500.00;    
                        }
                        else if(type.equalsIgnoreCase("cold")){
                            voucher="\nAmericano"+"\t Hot"+"\t\t\t 3500.00 Ks";
                            total=3500.00;
                            
                            System.out.println("\nThe cup size of Americano is only available for medium.");
                            voucher=voucher+"\n\t\t Medium"+"\t\t\t 500.00 Ks";
                            total=total+500.00;    
                        }
                        else{
                            System.out.println("\nThere is a typing error. "
                                    + "Please be careful that your input data must be 'Hot' and 'Cold'.");
                            System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                            order=scan.nextLine();
                        }
                    }
                }
                
//              For Cappuccino(Hot or Cold+Size)                
                else if(cname>=3 && cname<6){
                    if(cname==3){
                        System.out.println("\nHot  - 3200.00 Ks"
                                         + "\nCold - 3800.00 Ks");
                        System.out.print("\nPlease enter a text as 'Hot' or 'Cold': ");
                        String type=scan.nextLine();
                        
                        if(type.equalsIgnoreCase("hot")){
                            voucher="\nCappuccino"+"\t Hot"+"\t\t\t 3200.00 Ks";
                            total=3200.00;
                            
                            sizeList();
                            String size=scan.nextLine();

                            double sizeTotal=sizeCost(size);
                            String addSize=sizeInfo(size);
                            
                            if(size.equalsIgnoreCase(size)){
                                voucher=voucher + addSize;
                                total=total+sizeTotal;
                            }
                            else{
                                System.out.println("\nThere is a typing error. "
                                                + "\nPlease be careful that your input data must be 'small', 'medium' & 'large'."
                                                + "\nPlease try again.");
                                System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                                order=scan.nextLine();
                            }
                        }
                        else if(type.equalsIgnoreCase("cold")){
                            voucher="\nCappuccino"+"\t Cold"+"\t\t\t 3800.00 Ks";
                            total=3800.00;

                            sizeList();
                            String size=scan.nextLine();

                            double sizeTotal=sizeCost(size);
                            String addSize=sizeInfo(size);
                            
                            if(size.equalsIgnoreCase(size)){
                                voucher=voucher + addSize;
                                total=total+sizeTotal;
                            }
                            else{
                                System.out.println("\nThere is a typing error. "
                                                + "\nPlease be careful that your input data must be 'small', 'medium' & 'large'."
                                                + "\nPlease try again.");
                                System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                                order=scan.nextLine();
                            }
                        } 
                        else{
                            System.out.println("\nThere is a typing error. "
                                    + "Please be careful that your input data must be 'Hot' and 'Cold'.");
                            System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                            order=scan.nextLine();
                        }
                    }
                    
//              For Latte(Hot or Cold+Size)                    
                    else if(cname==4){
                        System.out.println("\nHot  - 3400.00 Ks"
                                         + "\nCold - 4000.00 Ks");
                        System.out.print("\nPlease enter a text as 'Hot' or 'Cold': ");
                        String type=scan.nextLine();
                        
                        if(type.equalsIgnoreCase("hot")){
                            voucher="\nLatte"+"\t\t Hot"+"\t\t\t 3400.00 Ks";
                            total=3400.00;
                            
                            sizeList();
                            String size=scan.nextLine();

                            double sizeTotal=sizeCost(size);
                            String addSize=sizeInfo(size);
                            
                            if(size.equalsIgnoreCase(size)){
                                voucher=voucher + addSize;
                                total=total+sizeTotal;
                            }
                            else{
                                System.out.println("\nThere is a typing error. "
                                                + "\nPlease be careful that your input data must be 'small', 'medium' & 'large'."
                                                + "\nPlease try again.");
                                System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                                order=scan.nextLine();
                            }
                        }
                        else if(type.equalsIgnoreCase("cold")){
                            voucher="\nLatte"+"\t\t Cold"+"\t\t\t 4000.00 Ks";
                            total=4000.00;
                            
                            sizeList();
                            String size=scan.nextLine();

                            double sizeTotal=sizeCost(size);
                            String addSize=sizeInfo(size);
                            
                            if(size.equalsIgnoreCase(size)){
                                voucher=voucher + addSize;
                                total=total+sizeTotal;
                            }
                            else{
                                System.out.println("\nThere is a typing error. "
                                                + "\nPlease be careful that your input data must be 'small', 'medium' & 'large'."
                                                + "\nPlease try again.");
                                System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                                order=scan.nextLine();
                            }             
                        }
                        else{
                            System.out.println("\nThere is a typing error. "
                                    + "Please be careful that your input data must be 'Hot' and 'Cold'.");
                            System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                            order=scan.nextLine();
                        }
                    }
                    
//              For Mocha(Hot or Cold+Size)                    
                    else{
                        System.out.println("\nHot  - 3500.00 Ks"
                                         + "\nCold - 4000.00 Ks");
                        System.out.print("\nPlease enter a text as 'Hot' or 'Cold': ");
                        String type=scan.nextLine();
                        if(type.equalsIgnoreCase("hot")){
                            voucher="\nMocha"+"\t\t Hot"+"\t\t\t 3500.00 Ks";
                            total=3500.00;
                            
                            sizeList();
                            String size=scan.nextLine();

                            double sizeTotal=sizeCost(size);
                            String addSize=sizeInfo(size);
                            
                            if(size.equalsIgnoreCase(size)){
                                voucher=voucher + addSize;
                                total=total+sizeTotal;
                            }
                            else{
                                System.out.println("\nThere is a typing error. "
                                                + "\nPlease be careful that your input data must be 'small', 'medium' & 'large'."
                                                + "\nPlease try again.");
                                System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                                order=scan.nextLine();
                            }
                        }
                        else if(type.equalsIgnoreCase("cold")){
                            voucher="\nMocha"+"\t\t Cold"+"\t\t\t 4000.00 Ks";
                            total=4000.00;
                            
                            sizeList();
                            String size=scan.nextLine();

                            double sizeTotal=sizeCost(size);
                            String addSize=sizeInfo(size);
                            
                            if(size.equalsIgnoreCase(size)){
                                voucher=voucher + addSize;
                                total=total+sizeTotal;
                            }
                            else{
                                System.out.println("\nThere is a typing error. "
                                                + "\nPlease be careful that your input data must be 'small', 'medium' & 'large'."
                                                + "\nPlease try again.");
                                System.out.print("\nDo you want to order again? \nPlease choose 'Yes' or 'No': ");
                                order=scan.nextLine();
                            }
                        }  
                    }
                }
                else{
                    System.out.println("\nYour input data can not be found."
                            + "\nPlease be careful that the input had to be only number 1 to 5."
                            + "\n Please try again.\n");
                    System.out.print("Do you want to order again? "
                                    +"\nPlease choose 'Yes' or 'No': ");
                    order=scan.nextLine();
                }
                
//              To add extra add-ons                
                System.out.print("\nDo you want to add extra add-ons (Flavor shots or Whipped)? \n"
                                +"Please enter 'Yes' or 'No': ");
                String ans=scan.nextLine();
                
//              If yes for extra add-ons
                
                while(ans.equalsIgnoreCase("yes")){
                    System.out.print("\nDo you want to add flavor? \n"
                                    + "Yes or No: ");
                    String more=scan.nextLine();
                    
//              If choose flavor
                    if(more.equalsIgnoreCase("yes")){
                        int j=1;
                        while(j<=2){
                            String[] flavor=new String[4];
                            flavor[0]="Vanilla    - 1500.00 Ks";
                            flavor[1]="Raspberry  - 2000.00 Ks";
                            flavor[2]="Cherry     - 2000.00 Ks";
                            flavor[3]="Peach      - 2300.00 Ks";

                            System.out.println("\nFlavor shots menu list: ");
                            for (int f=0; f < flavor.length; f++){
                                System.out.println("(" + (f+1) + ") " + flavor[f]);
                            }
                            System.out.print("\nPlease choose a number of flavor shots.\n"
                                            + "(example: type only number [1,2,3 or 4]): ");
                            int flav=Integer.parseInt(scan.nextLine());

                            if(flav>=1 && flav<=4){
                                if(flav==1){
                                    voucher=voucher+"\n\t\t Vanilla"+"\t\t 1500.00 Ks";
                                    total=total+1500.00;
                                }
                                else if(flav==2){
                                    voucher=voucher+"\n\t\t Raspberry"+"\t\t 2000.00 Ks";
                                    total=total+2000.00;
                                }
                                else if(flav==3){
                                    voucher=voucher+"\n\t\t Cherry"+"\t\t\t 2000.00 Ks";
                                    total=total+2000.00;
                                }
                                else{
                                    voucher=voucher+"\n\t\t Peach"+"\t\t\t 2300.00 Ks";
                                    total=total+2300.00;
                                }
                            }
                            else{
                                System.out.println("\nThere is an error. "
                                                    + "You can choose only numbers 1,2,3 & 4."
                                                    +"\nPlease try again.");
                                System.out.print("\nDo you want to try again? \n"
                                                + "Yes or No : ");
                                more=scan.nextLine();
                                if(more.equalsIgnoreCase("yes")){
                                    continue;
                                }
                                else{
                                    break;
                                }
                            }
                            
                            System.out.print("\nDo you want to add more flavor? \n"
                                            + "Yes or No : ");
                            more=scan.nextLine();
                            if(more.equalsIgnoreCase("yes")){
                                j++;
                                System.out.println("Flavor shots can be choose maximum two times for each products.");
                            }
                            else{
                                break;
                            }
                        }
                    }
                    
//              If choose whipped      
                    else if(more.equalsIgnoreCase("no")){
                        System.out.println("Flavor shot : Add no flavor");
                        total=total;
                        
                    }
                    else{
                        System.out.println("\nThere is a typing error. "
                                            + "Please be careful that your input data must be yes and no.");
                        System.out.print("\nDo you want to add extra add-ons? "
                                        +"\nPlease enter 'Yes' or 'No': ");
                        more=scan.nextLine();
                    }
                    
                    System.out.print("\nDo you want to add whipped cream? \n"
                                     + "Yes or No: ");
                    String cream=scan.nextLine();
                    if(cream.equalsIgnoreCase("yes")){
                        
                        int c=1;
                        while(c==1){
                            System.out.println("\nTypes of whipped cream: ");
                            String[] whipped=new String[4];
                            whipped[0]="Cream(Original)    - 2000.00 Ks";
                            whipped[1]="Salted Caramel     - 1000.00 Ks";
                            whipped[2]="Cream(Chocolate)   - 2300.00 Ks";
                            whipped[3]="Cream(Matcha)      - 1800.00 Ks";

                            for (int w=0; w < whipped.length; w++){
                                System.out.println("(" + (w+1) + ") " + whipped[w]);
                            }
                            System.out.print("\nPlease choose a number of whipped cream.\n"
                                            + "(example: type only number [1,2,3 or 4]): ");
                            int whip=Integer.parseInt(scan.nextLine());
                            
                            if(whip>0 && whip<5){
                                if(whip==1){
                                    voucher=voucher+"\n\t\t Cream(Original)"+"\t\t 2000.00 Ks";
                                    total=total+2000.00;
                                }
                                else if(whip==2){
                                    voucher=voucher+"\n\t\t Salted Caramel"+"\t\t 1000.00 Ks";
                                    total=total+1000.00;
                                }
                                else if(whip==3){
                                    voucher=voucher+"\n\t\t Cream(Chocolate)"+"\t 2300.00 Ks";
                                    total=total+2300.00;
                                }
                                else{
                                    voucher=voucher+"\n\t\t Cream(Matcha)"+"\t\t 1800.00 Ks";
                                    total=total+1800.00;
                                }
                            }
                            else{
                                System.out.println("\nThere is an error. You can choose only numbers 1,2,3 & 4."
                                                  +"\nPlease start again.");
                                System.out.print("\nPlease choose a number of whipped cream.\n"
                                            + "(example: type only number [1,2,3 or 4]): ");
                                whip=Integer.parseInt(scan.nextLine());
                                c--;
                            }
                            break;
                        }
                        break;
                    }
                    else if(cream.equalsIgnoreCase("no")){
                        System.out.println("Whipped cream : Add no cream");
                        total=total;
                    }
                    else{
                        System.out.println("\nThere is a typing error. "
                                            + "Please be careful that your input data must be yes and no.");
                        System.out.print("\nDo you want to add extra add-ons? "
                                        +"\nPlease enter 'Yes' or 'No': ");
                        ans=scan.nextLine();
                    }
                }
                
            
//              Customer information(name and phone)             
                System.out.print("\nPlease enter your name: ");
                String cusName=scan.nextLine();
                
                System.out.print("Please enter your phone number: ");
                String cusPhone=scan.nextLine();
                
//              Payment(cash or cod)                
                System.out.print("\nPayment Method: "
                                + "\n1. Cash"
                                + "\n2. Kpay or WavePay"
                                + "\nPlease choose a number for payment method: ");
                int pay=Integer.parseInt(scan.nextLine());
                if(pay>0 && pay<3){
                    if(pay==1){
                        System.out.println("Noted as pay with cash. \n");
                        detailInfo="Payment : Cash \n";
                    }
                    else if(pay==2){
                        System.out.println("\nKpay No: 09-753638245 \n"
                                            + "Wave pay No: 09-753638245 \n"
                                            + "Name: Sunset \n"
                                            + "Note: Please save the transaction screenshot and"
                                            + "show the proof of payment upon delivery arrived! \n"
                                            + "Thank You~\n");
                        detailInfo="Payment : Payment Done (need to collect only deli fee \n)";
                    }
                }
                else{
                    System.out.println("\nThere is an error. You can choose between 1.Cash or 2.Online Pay."
                                        +"\nPlease try again.");
                    System.out.print("Payment Method: ");
                    pay=Integer.parseInt(scan.nextLine());
                }
            
//              Service(pickup or deli)            
                System.out.print("\nOrder Service: "
                                + "\n1. Delivery"
                                + "\n2. Pickup"
                                + "\nPlease choose a number for service: ");
                int service=Integer.parseInt(scan.nextLine());
                
                if(service>0 && service<3){
                    if(service==1){
                        System.out.println("\nThere is 2 delivery times. \n"
                                        + "Morning: 9 a.m to 11:45 a.m \n"
                                        + "Noon: 2 p.m to 5:00 p.m \n"
                                        + "Depending on when the order is received. "
                                        + "We will arrange for delivery.");
                        detailInfo=detailInfo+"Service : Delivery";
                    }
                    else{
                        System.out.println("\nCustomer who will pickup by yourselves can pickup"
                                        + " at anytime during the shop's opening hours. \n"
                                        + "Open hours: 8:00 a.m to 6:00 p.m \n"
                                        + "Ph.no: 09-753638245");                        
                        detailInfo=detailInfo+"Service : Self Pickup";
                    }
                }
                else{
                    System.out.println("\nThere is an error. You can choose between 1.Delivery or 2.Pickup."
                                        +"\nPlease try again.");
                    System.out.print("Order service: ");
                    service=Integer.parseInt(scan.nextLine());
                }
                
                infoVoucher(total, voucher, cusName, cusPhone, detailInfo);
            }
    
//              If user didn't enter a number 1 to 5.                
            else{
                System.out.println("There is an error! Please check your number of choice and try again.");
            }
            
            System.out.print("Do you want to order again? \nPlease choose 'Yes' or 'No': ");
            order=scan.nextLine();
        }
    }
    
    public static void welcomeCafe(){
        String intro="Welcome from 'Sunset Cafe'.";
        System.out.println(intro.toUpperCase());
        System.out.print("\nDo you want to start your order? \n"
                         + "Please enter 'Yes' or 'No': ");
    }
    
    public static void menuList(){
        System.out.println("\nType of coffees: ");
        String[] cname={"Espresso","Amricano","Cappuccino","Latte","Mocha"};
        for (int i=0; i<cname.length; i++){
            System.out.println("("+(i+1)+") "+cname[i]);
        }                         
        System.out.print("\nPlease choose a number of coffee types.\n"
                        + "(example: type only number [1,2,3 or 4]): ");
    }
    
    public static void sizeList(){
        String[] size=new String[3];
        size[0]="Small  - no extra cost";
        size[1]="Medium - +500.00 Ks";
        size[2]="Large  - +1000.00 Ks";
        
        System.out.println("\nAvailable cup size: ");
        for (int s=0; s<size.length; s++){
            System.out.println(size[s]);
        } 
        System.out.print("Please enter a text to choose the size of cup..."
                        + "\n(example: type 'Small' to choose the small size): ");
    }
    
    public static String sizeInfo(String size){
        String addSize="empty";
        if(size.equalsIgnoreCase("small")){
            addSize="\n\t\t Small"+"\t\t +0.00 Ks";
        }
        else if(size.equalsIgnoreCase("medium")){
            addSize="\n\t\t Medium"+"\t\t 500.00 Ks";
        }
        else if(size.equalsIgnoreCase("large")){
            addSize="\n\t\t Large"+"\t\t 1000.00 Ks";
        }
        return addSize;
    }
    
    public static double sizeCost(String size){
        double sizeTotal=0.00;
        if(size.equalsIgnoreCase("small")){
            sizeTotal=sizeTotal;
        }
        else if(size.equalsIgnoreCase("medium")){
            sizeTotal=sizeTotal+500.00;
        }
        else if(size.equalsIgnoreCase("large")){
            sizeTotal=sizeTotal+1000.00;
        }
        return sizeTotal;
    }
    
    public static void infoVoucher(double total, String voucher, String cusName, String cusPhone, String detailInfo){
        System.out.printf("\n\n\t\t\t SUNSET CAFE \n"
                +"\t\t  Phone: 09-753636244 \n"
                +"\t\t Open hours: 8:00 a.m to 6:00 p.m \n\n"
                + "Customer Detail: \n"
                + "------------------------ \n"
                + "Name: %s \n"
                + "Phone %s \n"
                + "------------------------ \n" 
                +"\t\t >>>   Order Voucher   <<<"
                +"\n\t\t-----------------------------------\n"
                +"Order item \t Ingredient \t\t unitPrice \n"
                +voucher
                +"\n\t\t----------------------------------- \n"
                +"\t\t Total cost: \t\t %.2f Ks \n"
                +"------------------------ \n"
                +detailInfo
                +"\n\n\t\t Thank you for your purchase~\n\n",cusName, cusPhone, total);
    }
}
    

