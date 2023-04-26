# Jenkins Recovery
Jenkins job to automate secrets backup and restore procedures. 
It is lightweight and easily configurable, best suited for migration and recovery procedures of Jenkins instances.

## Usage
Currently, it works natively with **Google Cloud Storage**, but you can change this with minimal configuration.

The configure GCS, change the following parameters across jobs.
```bash
GCLOUD_CREDENTIALS_ID ='<YOUR_CREDENTIALS_ID>'
GCLOUD_BUCKET = '<YOUR_BUCKET_NAME>'
```

## Customization

Clone this project and import it as a Git Project in desired Jenkins instance.
Change upload and download steps to your likings.
