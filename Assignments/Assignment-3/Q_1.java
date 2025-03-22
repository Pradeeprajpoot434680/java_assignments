class Loan_EMI
{
    int principle_amount;
    float rate;
    int months;
    
    void setValue(int amount,float rate,int months)
    {
        principle_amount =amount;
        this.rate = rate;//give monthly rate
        this.months = months;
        
    }
    float calculate_EMI()
    {
        float emi = (float)(principle_amount*rate*Math.pow((1+rate),months)/(Math.pow((1+rate),months)-1));
        return emi;
    }
        
}


class Home_loan_EMI extends Loan_EMI
{
    float repo_rate;
    String home_type;
    
    void setValue(int amount,float rate,int months,float repo_rate,String home_type)
    {
        principle_amount =amount;
        this.rate = rate + repo_rate;//give monthly rate
        this.months = months;
        this.repo_rate = repo_rate;
        this.home_type = home_type;
    }
    void update_repo(float rp)
    {
        repo_rate = rp;
        this.setValue(principle_amount,rate,months,repo_rate,home_type);
    }
    // at the place of new calculate the  method to calculate Amount of EMI based on given
   //No._of_year by applying repo_rate in total rate of interest.
   // we will use parent method

}
        

class CAR_EMI extends Loan_EMI
{
    String car_model;
    void setValue(int amount,float rate,int months,String car_model)
    {
        principle_amount =amount;
        this.rate = rate ;
        this.months = months;
        this.car_model = car_model;
    }
    
    float calculate_EMI()
    {
        float emi = super.calculate_EMI();
        if(car_model.equalsIgnoreCase("alto"))
        {
            emi -= 10000;
        }
        if(emi<=0)
        {
            return 0;
        }
        return emi;
    }
}
   



class Question1
{
    public static void main(String arg[])
    {

        // first part of the question
        Loan_EMI a = new Loan_EMI();
        a.setValue(500000,0.00833f,60);
        System.out.println("Calculated emi for Loan is: "+a.calculate_EMI() );


        Home_loan_EMI b = new Home_loan_EMI();
        b.setValue(50000,0.00833f,60,0.004f,"flat");
        System.out.println("Calculated emi for Home is: "+b.calculate_EMI() );
        b.update_repo(0.008f);
        System.out.println("Calculated emi for Home is: "+b.calculate_EMI() );

        CAR_EMI c = new CAR_EMI();
        CAR_EMI d = new CAR_EMI();

        c.setValue(5000000, 0.00833f, 60, "alto");
        d.setValue(4000000, 0.00733f, 60, "swif");

        System.out.println("EMI for Cars: " + c.calculate_EMI());
        System.out.println("EMI for Cars: " + d.calculate_EMI());

    }
}

// output is :
// Calculated emi for Loan is: 10622.551
// Calculated emi for Home is: 1184.1454
// Calculated emi for Home is: 1449.9158
// EMI for Cars: 96225.51
// EMI for Cars: 82638.484