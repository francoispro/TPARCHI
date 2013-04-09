import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prixpomme=1,prixcerise = 0.75,total = 0,prixbanane=1.5;
		int cptfruit=0,cptcerise = 0,cptbanane=0,cptapples=0,cptmele=0,cptpommes=0;
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.print("Entrer :");
			String chaine = sc.next();
			/**csv**/
			String str[]=chaine.split(",");
			/**fin csv*/
			for(int i=0;i<str.length;i++)
			{
				cptfruit++;
				chaine = str[i];
			if (chaine.equals("Pommes")  || chaine.equals("Apples") || chaine.equals("Mele"))
			{
				total=total+(100*prixpomme);
				if(chaine.equals("Apples"))
				{
					cptapples++;
					if(cptapples==3)
					{
						cptapples=0;
						total = total - 100;
					}
				}
				else if (chaine.equals("Mele"))
				{
					cptmele++;
					if(cptmele==2)
					{
						cptmele=0;
						total = total - 150;
					}
				}
				else if (chaine.equals("Pommes"))
				{
					cptpommes++;
					if(cptpommes==4)
					{
						cptpommes=0;
						total = total - 100;
					}
				}
			}
			else if (chaine.equals("Cerises"))
			{
				total=total+(100*prixcerise);
				cptcerise++;
				//System.out.println("cpt" + cptcerise );
				if(cptcerise==2)
				{
					cptcerise=0;
					total = total - 20;
				}
			}
			else if  (chaine.equals("Bananes"))
			{
				total=total+(100*prixbanane);
				cptbanane++;
				if(cptbanane==2)
				{
					cptbanane=0;
					total = total - (100*prixbanane);
				}
			}
			else
				System.out.println("Erreur");
			}
			
			if(cptfruit==5)
			{
				cptfruit=0;
				total = total - 200;
			}
				
			System.out.println("> " + total);
		}
	}

}
