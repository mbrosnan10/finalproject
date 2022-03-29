

# 1st Demo   **31/01/2022**

for my first week I created a mutiltreaded Server and Client along with the file reading between the two 

## Server Side


for the Server side I ended up mutiltreaded it where when running it would show the number of the client and the ip address of the cilent.

## Client side


for this I got started on the reading of the file I/O where when the client is running It would ask the user to enter a name of a County and the item would reference back to the weather textfile and search for the County that has been asked to be searched . if it is there it will print out the details and if not I will ask the user to enter the County again.



# 2nd Demo **10/02/2022**

For My second demo I fixed the issues that came with all of the parsed file printed out

## Server side

I worked on both fixing up my Server to make sure it was mutilthreaded as well as adding the IP config so it shows where each cilent is coming from. I also added a writer to a temp file to this side so when the cilent types in number three it should print out the adverages to this temp file and server

## Error Handler 

For this I had to make sure that when the user types in a wrong county/isnt abling by case sensitiviity a pop up entitled "Invaild County" should come up. This along with if a invalid number of the menu items come up that for example number 7 it should come up with a message that reads "Invaild Number"

## Client Side

For My Client side I ended Up puttin in a menu options 
1. [x] This was the original thisng that was asked for in my project which was to enter a County and output the allocated County
2. [x]  This is printing out all the countys that are in the file
3. [x] this is the highest between the two Lo_hi and Hi_Lo and print out each of the Counties and which of the temperatures is the highest
4. [] The was suppose to give the adverage for the total of the whole of irelnad
5. []This allows for the user to exit the project.


# Final upload (upload to lit Moodle) **13/02/2022**

For my Final part of this project That i  did demostrate in the class for the *14/02/2022*

 ## Server Side 
This is a mutilthreaded server that is able to communicate with many Clients
for this using Stream Tokeniser I connecte this to my Client. In this it would say "Hello" to acknowelege that it is up a running. I would then wait or the Client to run
 in which it wuld say the Client IP ADDRESS .
 
 
### Weather Class

This is getting all the element from the file "weathers.txt" where they are all in a string (County,Weather_Today, Lo_Hi,Weather_Tommorrow,Lo_Hi1)

### Error Handleing
For this I had to make sure that when the user types in a wrong county/isnt abling by case sensitiviity a pop up entitled "Invaild County" should come up. This along with if a invalid number of the menu items come up that for example number 7 it should come up with a message that reads "Invaild Number".

## Client Server
For My Client side I ended Up puttin in a menu options 
1. This was the original thisng that was asked for in my project which was to enter a County and output the allocated County.
2. Prining out all the County in the file
3 allowing for the user to check if the file has changed ( We have to enter this in order to intalise the ToCgane Method o tht once it does change it will ccome up sAYING THE FILE HAS BEEN CHANGED)
4. It allows to exit the menu.




