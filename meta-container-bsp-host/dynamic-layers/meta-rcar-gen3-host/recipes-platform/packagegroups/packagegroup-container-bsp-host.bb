SUMMARY = "host package group for Renesas R-Car Gen3"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
    packagegroup-container-bsp-host-kmodules \
    packagegroup-container-bsp-host-firmware \
"

PR = "r0"

RDEPENDS_packagegroup-container-bsp-host-kmodules = " \
    kernel-module-gles \
    kernel-module-mmngr \
    kernel-module-mmngrbuf \
    kernel-module-qos \
    kernel-module-uvcs-drv \
    kernel-module-vsp2driver \
    kernel-module-vspm \
    kernel-module-vspmif \
"

RDEPENDS_packagegroup-container-bsp-host-firmware = " \
    gles-user-module-firmware \
"

