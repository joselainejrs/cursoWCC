public class ContaSeg{
  
  public static void main(String args[]){

 	Conta  mConta=new Conta();
	 Conta  fConta=new Conta();

	 mConta.saldo = 60;
	 fConta.saldo = 20;

  	System.out.println("MConta antes da transferencia " +  mConta.saldo);
  
        fConta.transfere(mConta, 10);

         System.out.println("mConta depois da transferencia " +  mConta.saldo);
   }
}