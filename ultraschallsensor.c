#include <EEPROM.h>



int trigger= 5;
int echo = 6;
int dauer = 0;
int entfernung = 0;


void setup() {
 
 Serial.begin(9600);
 pinMode(trigger, OUTPUT); 
 pinMode(echo, INPUT);	
}

void loop (){
  
  digitalWrite(trigger, LOW);
  delayMicroseconds(5);
  digitalWrite(trigger, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigger, LOW);
  
  dauer = pulseIn(echo, HIGH);
  
  entfernung = (dauer/2) * 0.03432;
  
  Serial.println(entfernung);
delay(1000);
  
  EEPROM.write(12,entfernung);
  Serial.println(EEPROM.read(12));
  
}
  