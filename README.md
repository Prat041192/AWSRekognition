# AWSRekognition
Rekognition is aws tool for Image and Video analysis.
This Project helps in understanding the use of AWS Image Rekognition implementation using the AWS Java SDK.

## Getting started
Download the project and host it over AWS EC2 instance of local machine.

## Prerequisites
You need to have installed AWS CLI and configured with user profile. Follow the instructions on AWS CLI configuration documentation for instructions.

## Using the project
Sample project can be used for demonstration purposes and other implementation purposes. 
On running the project browse the path http://<domain name >:<port number>/detectlabel

### JSON object model
{ "photoname": ["Image1.jpg", "2.jpg", "Image2.jpg"], "bucketName": "S3BucketName" }
Configure the ECAssignmentApplication.java with userprofile name that you have configured over the machine.

## Author
Prateek Narula - Initial draft
