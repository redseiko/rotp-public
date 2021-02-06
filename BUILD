java_library(
    name = "everything",
    srcs = glob(["src/rotp/**/*.java"]),
    javacopts = ["-XepAllErrorsAsWarnings"],
    resources = glob([
        "src/rotp/data/**",
        "src/rotp/images/**",
        "src/rotp/lang/**",
        "src/rotp/races/**",
    ]),
)

java_binary(
    name = "RemnantsOfThePrecursors",
    main_class = "rotp.Rotp",
    runtime_deps = [":everything"],
)
