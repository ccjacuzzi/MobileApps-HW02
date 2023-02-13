# MobileApps-HW02
A simple "Hello, World!" Android application to get acquainted with Android Studio.

Actually, this wasn't a simple "Hello, World!" application. I learned a lot about how the files in an Android project interact. I also had to learned about some of the libraies that can be used: TextUtils, TextView, and Handler. 

I approached TODO 06, "Avoid updating the text label..." by using an if/else statement. If the user clicked the show text button while the text input was empty, the hint text in the input field would breifly change to let them know there was a problem. Else, when the user clicks the show text button, the text is displayed.

I used a similar idea for the "cleanTextField" method. To clean the text input, I change the text to an empty string and then removed the focus from the field.

In both methods, I used a handler to breifly display the error message before reverting back to the original.
