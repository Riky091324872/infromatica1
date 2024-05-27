#include<stdio.h>

int main ()
{
	int italiano1,italiano2,italiano3,storia1,storia2,storia3,matematica1,matematica2,matematica3,media1,media2,media3;

	printf("inserisci voto 1 di italiano1 ");
	scanf("%d", &italiano1);
	printf("inserisci voto 2 di italiano2 ");
	scanf("%d", &italiano2);
	printf("inserisci voto 3 di italiano3 ");
	scanf("%d", &italiano3);
	printf("inserisci voto 1 di storia1 ");
	scanf("%d", &storia1);
	printf("inserisci voto 2 di storia2");
	scanf("%d", &storia2);
	printf("inserisci voto 3 di storia3");
	scanf("%d", &storia3);
	printf("inserisci voto 1 di matematica1");
	scanf("%d", &matematica1);
	printf("inserisci voto 2 di matematica2");
	scanf("%d", &matematica2);
	printf("inserisci voto 3 di matematica3");
	scanf("%d", &matematica3);
	
	media1=(italiano1+italiano2+italiano3)/3;
    media1=(storia1+storia2+storia3)/3;
   	media1=(matematica1+matematica2+matematica3)/3;
	
	printf("      +-------+-------+-------+-------+\n");
	printf("      | voto1 | voto2 | voto3 | media |\n");
	printf("+-----+-------+-------+-------+-------+\n");
	printf("| ita |  %2d   |   %2d  |   %2d  |   %2d  |\n",italiano1,italiano2,italiano3,media1);
	printf("+-----+-------+-------+-------+-------+\n");
	printf("| sto |  %2d   |   %2d  |   %2d  |   %2d  |\n",storia1,storia2,storia3,media2);
	printf("+-----+-------+-------+-------+-------+\n");
	printf("| mat |  %2d   |   %2d  |   %2d  |   %2d  |\n",matematica1,matematica2,matematica3,media3);
	printf("+-----+-------+-------+-------+-------+\n");
	
	return 0;
}