# python-word-count

This demo covers using Apache Beam with the Python SDK with a sample wordcount application.

This demo uses `sentry-sdk` 0.13.1 and `apache-beam` 2.16.0 and uses Beam's direct runner.

## First Time Setup

The Beam SDK requires Python 2 users to use Python 2.7 and Python 3 users to use Python 3.5 or higher. For this demo, we will be using Python 3.

Check your your python3 version and make sure it is 3.5 or above.

```bash
python3 --version
```

Clone the repository and cd into it.

```bash
git clone git@github.com:sentry-demos/apache-beam.git
cd apache-beam/python-beam-example
```

Setup and activate a Python3 environment.

```bash
python3 -m pip install virtualenv
python3 -m virtualenv .venv
source .venv/bin/activate
```

Install all required dependencies.

```
pip install -r requirements.txt
```

Add your Sentry DSN to the `.env` file OR add it to your environmental variables.

> .env
```
SENTRY_DSN=__PUBLIC_DSN_HERE__
```

If needed, you can deactivate your virtualenv using:

```bash
deactivate
```

## Run

Make sure you have your virtualenv running.

```bash
source .venv/bin/activate
```

Run the example wordcount application.

```bash
python wordcount.py --input README.md --output results/counts
```

It should fail and an error should show up in your Sentry project.

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
