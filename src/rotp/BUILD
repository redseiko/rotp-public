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
    runtime_deps = ["@maven//:com_google_flogger_flogger_system_backend"],
    deps = [":resource_manager"],
)

java_library(
    name = "resource_manager",
    srcs = ["ResourceManager.java"],
    deps = ["@maven//:com_google_flogger_flogger"],
)
