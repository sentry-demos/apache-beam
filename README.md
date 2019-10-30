# sentry-demos/apache-beam

This demo covers using Apache Beam with the Python SDK.

This demo uses `apache-beam` v

## First Time Setup

The Beam SDK requires Python 2 users to use Python 2.7 and Python 3 users to use Python 3.5 or higher. For this demo, we will be using Python 3.

Check your your python3 version using

```bash
python3 --version
```

Make sure pip version `7.0.0` or above is installed

```bash
pip --version
```

You can upgrade pip using

```bash
pip install --upgrade pip
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

Install all required dependencies. This demo depends on apache-beam 

```
pip install -r requirements.txt
```

## Run

