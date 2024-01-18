# include <stdio.h>
int main(){
    FILE*fp,*fp1,*fp2;
    fp=fopen("file.txt","r");
    fp1=fopen("file1.txt","r");
    fp2=fopen("file2.txt","w");
    char ch;
    if(fp==NULL||fp1==NULL||fp2==NULL){
        printf("Could not open this file");
    }
    
      
      while((ch=fgetc(fp))!=EOF){
        fputc(ch,fp2);
      }
      while((ch==fgetc(fp1))!=EOF){
        fputc(ch,fp2);
      }
      printf("%d",fp2);
      fclose(fp);
      fclose(fp1);
      fclose(fp2);
}