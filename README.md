# lein-var-file

A Leiningen plugin to create an environment variables file. Works great with [environ](https://github.com/weavejester/environ).

## Usage

Put `[lein-var-file "0.3.0"]` into the `:plugins` vector of your project.clj.

Run this

    $ lein var-file

and a file called .env-vars will get generated, containing all current key-value pairs in the ```:env``` key in the current profile in the following format:

```
ENV_VAR1=1
ENV_VAR2=2
```
This plugin integrates well with [environ](https://github.com/weavejester/environ), which puts all environemnt variables, the settings in ```project.clj``` and ```profiles.clj``` in the ```:env``` key of the current profile. Environ generates a ```.lein-env``` file that contains a clojure map where this plugin creates a file with the same key-value pairs but in a different format that's more convenient for working with, say, Docker containers. 

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
