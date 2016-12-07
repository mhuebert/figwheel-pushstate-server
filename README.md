# figwheel pushstate server

To use, add the following two forms to `project.clj`:

-  `figwheel-server.core/handler` as the `:ring-handler` in `:figwheel`:

```clj
:figwheel {:ring-handler figwheel-server.core/handler}

```

- `[figwheel-pushstate-server "0.1.0"]` to dev dependencies:

```clj
:profiles {:dev {:dependencies [[figwheel-pushstate-server "0.1.0"]]}}            
```

Now, request paths that are not found as files in `resources/public` will be redirected to `index.html`.

(based on Kenneth Kalmer's [blog post](https://opensourcery.co.za/2016/05/27/smooth-client-side-routing-in-a-figwheel-only-project/) which was, in turn, inspired by Arne Brasseur's [chestnut](https://github.com/plexus/chestnut).)
 
 
