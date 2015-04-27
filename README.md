# lein-var-file

A Leiningen plugin to do many wonderful things.

## Usage

Put `[lein-var-file "0.2.0"]` into the `:plugins` vector of your project.clj.

Run this

    $ lein var-file

and a file called .env-vars will get generated, containing all current environemnt variables in this format:

ENV_VAR1=1
ENV_VAR2=2

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
