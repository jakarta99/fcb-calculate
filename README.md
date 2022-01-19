# Course 1
## Java Entry Point
���z�Ѩϥ� IDE (Eclipse/IntelliJ) �إߤ@�� Java �M��, �b Eclipse Java Project ���U, 
src �ؿ��O java source folder, �ҥH�N�O�b /src �ؿ����U�إ� java �ɮ�, 
IDE �|�۰� compile �� /bin �ؿ����U���� .class �ɮ�.

�� Java �i�J�I�N�O

```java
public class WhatYouWannaApp {

  public static void main(String[] args) {
      System.out.println("Java Entry Point is this main method");
  }
}
```
 

���۴N�i�H�z�L Run As.. Java Application, �N�i�H�b Console ���U�d�ݹB�@�����G�C

## �I�s�t�~�@�Ӫ���
�q�`�ڭ̤��|��L�h���޿��b Entry Point ����, �ڭ̷|��ӷ~�޿�w�q�b Service Layer,
�Ҧp CalculateApp �h�I�s CalculateService, ��ڭ̭n�ϥ� CalculateService, 
���D CalculateService �� static method, ���M, �ڭ̴N�n new �Ӫ���_�ӡC

```java
CalculateService service = new CalculateService();
int result = service.sum(1,2);
```

�إߤ@�Ӫ���, �N�O�n�z�L constructor, �غc�l�N�O�P class �ۦP�W�r�� method name,
����Ʀ� return type. ��A���S�����g����غc�l����, 
�N�O�w�]�@�ӨS������Ѽƪ� constructor. 

��A�����g�t�~�@�ӫغc�l��, �쥻���ê��L�Ѽƫغc�l�N���s�b�F, 
��A�P�ɻݭn�L�Ѽƫغc�l�P���Ѽƫغc�l��,
�u�ݭn�g��Ӥ��P�Ѽƪ��غc�l�Y�i�C


## �ޥ� Lib Jars
�ҨϥΪ��~�� jar �ɮ�, �N�O�n�� jar �ɮש�b ClassPath ����, 
�ڭ̳q�`�|�� jar �ɮש�b /lib �ؿ�, 
�b IDE ����, �Ȼݭn�]�w Java Build Path -> Libaries -> Classpath.. �h�W�[�� Jar �ɮ�




