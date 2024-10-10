# java-training-4.0

This is a project for all homeworks for AQA Training 4.0

## Local Settings

1. Generate SSH key if you don't have one https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent 
2. Add your newly created SSH key if you haven't added it yet https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account

## UI Easy Way
1. Navigate to https://github.com/JavaTrainingFourthPhase/java-training-4.0
2. In the right upper corner find button `Use this template` and click it
 <img width="1232" alt="image" src="https://github.com/user-attachments/assets/558a70c4-01c3-477f-8014-80468fabff96"> <br/>
3. On the opened page complete next actions: <br/>
   a. Select `Include all branches` <br/>
   b. Choose your `Owner` <br/>
   c. Paste repository name (can be the same as original `java-training-4.0`) <br/>
   d. Make repo public <br/> 
   e. Click button `Create repository` <br/>
   f. Navigate to your own account and find your new repository :tada: <br/>
   g. :warning: **Do not forget to clone your own new repo!**
   ```
   mkdir Git 
   cd Git
   git clone git@github.com:<your username>/java-training-4.0.git
   ```
<img width="834" alt="image" src="https://github.com/user-attachments/assets/cbfd1e96-29eb-4099-a9db-89c480a484b5"> <br/>


## For those who like some spicy solutions
1. Install GitHub CLI ```brew install gh``` on your Mac
2. Login into GitHub CLI ```gh auth login``` and follow all instructions (here is the example of how it should look) <br/><br/>
<img width="762" alt="image" src="https://github.com/user-attachments/assets/ace9f093-e4e0-4292-afcd-6f5ddd108ef4"> <br/><br/>
3. Navigate to the folder where you would like to store repo locally
4. Create your own repo from template via command ```gh repo create java-training-4.0 --public --template https://github.com/JavaTrainingFourthPhase/java-training-4.0.git --include-all-branches --clone```

## IntelliJ IDEA project configuration
1. Import in IntelliJ IDEA using `File -> New -> Project from Existing Sources...`.
2. Select the directory of your local repo. 
3. Go through the `Import Project` wizard by clicking `Next`.
4. On `Please select project SDK` point it to your Java 11 JDK.
5. Press `Ctrl+Alt+Shift+S` (`Command + ;`) and check that in your `Project Structure`.
   Check value of `Project language level` is set to `11 - Local variable syntax etc.`.

## Homework 

1. Checkout corresponding branch for the homework
2. In case if you see that classes are marked with red dot <img width="302" alt="image" src="https://github.com/user-attachments/assets/336e14f1-9bc2-44fb-9790-5153fe9f1558"> <br/>
   :arrow_right: click on **`src`** folder and mark it as a **`Sources Root`** <br/>
    <img width="617" alt="image" src="https://github.com/user-attachments/assets/66a2dae2-f99f-4cbf-9139-44aacacfb634">
3. Read README.md file for the homework task
4. Open test class, put your cursor on `@Test` annotation, press `Alt+Enter`
   and choose `Add 'testng' to classpath`.
5. Set the value to `org.testng:testng:7.1.0` and mark checkbox `Download to`.
6. Complete all TODO tasks. Do not change test class.
7. After you finished assignment compilation should be without any errors (`Ctrl+F9` or `Command + F9`).
8. Do the task =) 
