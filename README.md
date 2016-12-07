# figwheel pushstate server

Just a simple ring handler to have [figwheel's](https://github.com/bhauman/lein-figwheel) dev server nicely handle pushState routes.

To use, add the following to `project.clj`:

- `[figwheel-pushstate-server "0.1.0"]` to dependencies (or :dev dependencies, as shown here):

```clj
:profiles {:dev {:dependencies [[figwheel-pushstate-server "0.1.0"]]}}            
```

-  `figwheel-server.core/handler` as the `:ring-handler` for `:figwheel`:

```clj
:figwheel {:ring-handler figwheel-server.core/handler}

```

Requested paths that do not resolve to files in `resources/public` will fall back to `index.html`.

(based on Kenneth Kalmer's [blog post](https://opensourcery.co.za/2016/05/27/smooth-client-side-routing-in-a-figwheel-only-project/) which was, in turn, inspired by Arne Brasseur's [chestnut](https://github.com/plexus/chestnut).)
 
 
