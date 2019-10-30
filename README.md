# sentry-demos/apache-beam

This demo covers using Apache Beam with the Python SDK with a sample wordcount application.

This demo uses `apache-beam` 2.15.0 and `sentry-sdk` 0.13.1 and uses Beam's direct runner.

## First Time Setup

The Beam SDK requires Python 2 users to use Python 2.7 and Python 3 users to use Python 3.5 or higher. For this demo, we will be using Python 3.

Check your your python3 version and make sure it is 3.5 or above.

```bash
python3 --version
```

Clone the repository and cd into it

```bash
git clone git@github.com:sentry-demos/apache-beam.git
cd apache-beam
```

Setup and activate a Python3 environment

```bash
python3 -m pip install virtualenv
python3 -m virtualenv .venv
source .venv/bin/activate
```

Install all required dependencies.

```
pip install -r requirements.txt
```

You can deactivate your virtualenv using

```bash
deactivate
```

Add your Sentry DSN to the .env file:

> .env
```
SENTRY_DSN=__PUBLIC_DSN_HERE__
```


## Run

Make sure you have your virtualenv running

```bash
source .venv/bin/activate
```

Run the example wordcount application

```bash
python3 -m apache_beam.examples.wordcount --input README.md --output results/counts
```

## Troubleshooting

### Pip issues?

Make sure pip version `7.0.0` or above is installed

```bash
pip --version
```

You can upgrade pip using

```bash
pip install --upgrade pip
```