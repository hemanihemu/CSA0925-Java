class Bank 
{
    float RATEofinterest;

    void SBI(float a) 
{
        RATEofinterest = a;
    }

    void ICICI(float b) 
{
        RATEofinterest = b;
    }

    void AXIS(float c) 
{
        RATEofinterest = c;
    }

    public static void main(String[] args) 
{
        Bank bank = new Bank();
        bank.SBI(8.5f);
        System.out.println("SBI Bank Rate of Interest: " + bank.RATEofinterest);

        bank.ICICI(7.5f);
        System.out.println("ICICI Bank Rate of Interest: " + bank.RATEofinterest);

        bank.AXIS(9.0f);
        System.out.println("AXIS  Bank Rate of Interest: " + bank.RATEofinterest);
    }
}