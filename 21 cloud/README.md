# Deploying a Servlet application to AWS cloud

1. Sign up for an AWS account if you don't have one already.
2. Create a virtual server in the cloud for an instance that will be running a Tomcat server which is known as a t2.micro instance, which is a part of Amazon's free tier offering. To create this server, you need to log in to your AWS dashboard and navigate to Elastic Beanstalk by clicking on the services option.

3. After clicking, you are going to Get Started by entering a few simple details to get your environment up and running. 

    - Mention the name of your application or product you are building.
    - Choose a platform - Tomcat platform for launching Java web app.
    - Lastly, you can select to launch a simple application or WAR file.

4. We need to upload the application as a WAR File. To do so, just say clean & build from NetBeans. It will create a WAR file in your project/target directory
    
5. Uploading the WAR file will take a few minutes. Once it is done, hit the 'Create Application' button, AWS will proceed to create your environment for you.

6. You will then be redirected to the dashboard of the deployed application. Here you can see the URL of your app. Click on the URL and you will see the index or the default page of your Servlet application.