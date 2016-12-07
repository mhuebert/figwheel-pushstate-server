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