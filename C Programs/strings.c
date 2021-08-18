#include<stdio.h>
int main()
{
  int c = 0, v = 0,co=0;
  char s[100];

  printf("Input a string\n");
  gets(s);

  while (s[c] != '\0') {
	  if((s[c]>='A'&&s[c]<='Z')||(s[c]>='a'&&s[c]<='z'))
	  {
		  if (s[c] == 'a' || s[c] == 'A' || s[c] == 'e' || s[c] == 'E' || s[c] == 'i' || s[c] == 'I' || s[c] =='o' || s[c]=='O' || s[c] == 'u' || s[c] == 'U')
      	{
		v++;
	  	printf("\nVowels=%c",s[c]);
	  	}
	  
	 	 else
	  	{
		  printf("\nConsonants=%c",s[c]);
		  co++;
	  	}
	  
	  }
    
	  printf("%c",s[c]);
    c++;
  }
  printf("\nNumber of vowels in the string: %d", v);
  printf("\nNumber of consonants in the string: %d",co);
  return 0;
}