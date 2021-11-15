SUMMARY = "package group for container host"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
    packagegroup-container-bsp-host-kmodules \
    packagegroup-container-bsp-host-firmware \
"

PR = "r0"

RDEPENDS_packagegroup-container-bsp-host-kmodules = " \
"

RDEPENDS_packagegroup-container-bsp-host-firmware = " \
"

