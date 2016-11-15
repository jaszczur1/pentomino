package test;

import java.util.ArrayList;

public class main {

	int element = 5; 

	
	int[][] table_pom = new int [5][5];
	
	int table[][]={
				                                         
			   {1,2,2,6,6,6,6,10,10,10},
			   {1,2,2,4,6,7,7,7,7,10},
		       {1,2,4,4,4,8,12,12,7,10},
		       {1,3,5,4,8,8,8,12,11,11},
		       {1,3,5,5,9,9,8,12,12,11},
		       {3,3,3,5,5,9,9,9 ,11,11},
		       
	};
	
	int table_martyca[][]={
			   
			   {0,0,0,0,0,0,0,0,0,0},
			   {0,0,0,0,0,0,0,0,0,0},
		       {0,0,0,0,0,0,0,0,0,0},
		       {0,0,0,0,0,0,0,0,0,0},
		       {0,0,0,0,0,0,0,0,0,0},
		       {0,0,0,0,0,0,0,0,0,0},
		       
};
	
	
	
	
	int[][] table_element1={
			
										{0,0,0,0,0},
										{0,0,0,0,0},
										{0,0,0,0,0},
										{0,0,0,0,0},
										{1,1,1,1,1}
										
	};

	int[][] table_element2={
											
			
										{0,0,0,0,0},
										{0,0,0,0,0},
										{0,0,0,0,0},
										{0,2,2,2,0},
										{0,0,2,2,0}							
	};
	
	
	int[][] table_element3={
			
			
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,3,0,0},
			{0,0,3,0,0},
			{0,3,3,3,0}
			
};


	int[][] table_element4={
			
			
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,4,0,0},
			{0,4,4,4,0},
			{0,0,4,0,0}
			
};


	int[][] table_element5={
			
			
			{0,0,0,0,0},
			{0,0,5,0,0},
		    {0,0,5,5,0},
		    {0,0,0,5,5},
		    {0,0,0,0,0}		
			
};
int[][] table_element6={
			
			{0,0,0,0,0},
			{0,0,6,0,0},
			{0,0,6,0,0},
			{0,6,6,0,0},
			{0,0,6,0,0}
			
};
	
int[][] table_element7={
		
		{0,0,0,0,0},
		{0,7,0,0,0},
		{0,7,0,0,0},
		{0,7,0,0,0},
		{7,7,0,0,0}
		
};
int[][] table_element8={
		
		{0,0,0,0,0},
		{0,8,0,0,0},
		{0,8,8,8,0},
		{0,0,8,0,0},
		{0,0,0,0,0}
		
};

int[][] table_element9={
		
		
		
		{0,0,0,0,0},
		{9,9,0,0,0},
		{0,9,9,9,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
		
};	

int[][] table_element10={
		
		
		
		{0,0,10,10,10},
		{0,0,0,0,10},
	    {0,0,10,10,10},
	    {0,0,0,0,0},
		{0,0,0,0,0}
};

int[][] table_element11={
		
		
		
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,11,11},
		{0,0,0,11,0},
		{0,0,0,11,11}
		
};


int[][] table_element12={
		
		
		
		{0,0,0,0,0},
		{0,12,12,0,0},
		{0,0 ,12,0,0},
		{0,0 ,12,12,0},
		{0,0,0,0,0}
		
};
				
	ArrayList<int [][]> lista = new ArrayList<>();
	
	
	void init(){
		lista.add(table_element1);
		lista.add(table_element2);
		lista.add(table_element3);
		lista.add(table_element4);
		lista.add(table_element5);
		lista.add(table_element6);
		lista.add(table_element7);
		lista.add(table_element8);
		lista.add(table_element9);
		lista.add(table_element10);
		lista.add(table_element11);
		lista.add(table_element12);
		
	};
	


	void wypisz(int [][] table) {

		for (int i = 0; i < table.length; i++) {

			System.out.println();

			for (int j = 0; j < table[i].length; j++) {

				System.out.print(table[i][j]);
			}
		}
		System.out.println();
		System.out.println("funkcja wypisz");
	};

	int[][] filtruj(int[][] table_element) {
		int table_pom[][] = new int[table.length][table.length];

		int i, j = 0;
		int najmiejszyX = Integer.MAX_VALUE;
		int najmiejszyY = Integer.MAX_VALUE;

		for (i = 0; i < table_element.length; i++) {
			for (j = 0; j < table_element.length; j++) {

				if (table_element[i][j] != 0) {

					if (j < najmiejszyX) {

						najmiejszyX = j;
					}
					if (i < najmiejszyY) {
						najmiejszyY = i;
					}
				}
			}
		}
		
		for (int k = 0; k < table_element.length; k++) {
			for (int k2 = 0; k2 < table_element.length; k2++) {

				try {

					table_pom[k][k2] = table_element[k + najmiejszyY][k2 + najmiejszyX];

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}

		return table_element = table_pom;

	};

	int[][] obruc_w_lewo(int[][] table_element) {

		int size = table_element.length; 
		
		int i_pom=0;
		
		int[][] table_pom = new int[size][size];

		for (int j = table_element.length - 1; j >= 0; j--) {
			
			
			for (int i = 0; i < table_element.length; i++) {

				table_pom[i_pom][i] = table_element[i][j];

			}
			i_pom++;
		}

		table_element = table_pom;
		
		
		
		System.out.println("obracam w lewo");
		
		System.out.println();
		
		 try {
			 
			 wypisz(table_element);
			 
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return  filtruj(table_element);

	};

	int[][] odwrauc_w_lustrzamym(int[][] table_element) {

		int temp = table_element.length - 1;

		int table_pom[][] = new int[temp + 1][temp + 1];

		for (int i = 0; i < table_element.length; i++) {

			for (int j = temp; j >= 0; j--) {

				table_pom[i][-j + temp] = table_element[i][j];
			}
		}
		table_element = table_pom;

		System.out.println("funkcja lustro");

		
		return filtruj(table_element);
	};

       int dopasuj(int[][] table_element) {

		int ile = 0;
		
		
		int[][] table_pom1 = new int[5][5];
	

		for (int i = 0; i < this.table.length; i++) {
			for (int j = 0; j < this.table.length; j++) {
				
				
				try {

					for (int j2 = 0; j2 < table_element.length; j2++) {
						
						for (int k = 0; k < table_element.length; k++) {

							if (this.table[i+j2][j+k] == table_element[j2][k] && table_element[j2][k] != 0) {

								System.out.println(++ile);
								
								
		System.out.println("dopasowane " + i + " " + j + " " + j2 + " " + k+ " pobrane wartosci" + this.table[j2+i][k+j]);

							if(ile == this.element) { 
									

								for (int a = 0; a < this.table.length; a++) {
									for (int b = 0; b < this.table.length; b++) {
										try {

											for (int c = 0; c < table_element.length; c++) {
												
												for (int d = 0; d < table_element.length; d++) {

													if (this.table[a+c][b+d] == table_element[c][d] && table_element[c][d] != 0) {

														
														
														this.table_martyca[a+c][b+d] = this.table[a+c][b+d];
							
													}
												}
											}

											
										

										} catch (Exception e) {
										
										}
										
									}
								
								}
										
								
								System.out.println("mam to zadanie");
								
								wypisz(this.table_martyca);  return ile;
		
							}
							}
						}
					}

					ile = 0;
				

				} catch (Exception e) {
					
				}
				
			}
		}
				          
          return ile;
	}

	
	public static void main(String[] args) {

		main m = new main();
		
		
		m.init();
		m.wypisz(m.table_martyca);


  
	while (!m.lista.isEmpty()) {
			
		
		m.table_pom = m.lista.get(0);
		
		
		    int dop =m.dopasuj(m.table_pom);
		
		    
		    if( dop == 5){ m.lista.remove(0);System.out.println("bez obracania "); continue; }
		    
		    else {
				
	
			while( dop < 5 ){
				
				 try {
				
				 boolean czy_odwrucone_w_lustrze = false;
				
				 for (int i = 0; i < 3; i++) {
				 
				
			    if( m.dopasuj( m.obruc_w_lewo(m.table_pom))==5 ) {  dop =5;  System.out.println("koniec bez lustra"); break;};
				
			 if(i == 2 && czy_odwrucone_w_lustrze == false){
				 

				 i=0;
				 
			     if(m.dopasuj( m.odwrauc_w_lustrzamym(m.table_pom)) ==5 || m.dopasuj(m.obruc_w_lewo(m.table_pom)) == 5){
			    	 
			    	 dop =5;  System.out.println("koniec z lustrem"); break;
			    	 
			     }
				 
				 }
				 }
				 
		
						
				 } catch (Exception e) {
				 
				 }
				
				
				System.out.println("dopasowanie");
								
				
				
		System.err.println("to koniec");
	
			m.lista.remove(0);
		
			}
		    }
	}
}
}

