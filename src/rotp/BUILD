package(default_visibility = ["//visibility:public"])

java_library(
    name = "rotp",
    srcs = glob(
        ["**/*.java"],
        exclude = [
            "ResourceManager.java",
        ],
    ),
    javacopts = ["-XepAllErrorsAsWarnings"],
    resources = glob([
        "data/**",
        "images/**",
        "lang/**",
        "races/**",
    ]),
    deps = [":resource_manager"],
)

java_library(
    name = "resource_manager",
    srcs = ["ResourceManager.java"],
    deps = [],
)
