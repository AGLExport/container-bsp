SUMMARY = "Renesas R-Car Gen3 host package group for host"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
    packagegroup-rcar-gen3-host-kmodules \
    packagegroup-rcar-gen3-host-firmware \
"

PR = "r0"

RDEPENDS_packagegroup-rcar-gen3-host-kmodules = " \
    kernel-module-gles \
    kernel-module-mmngr \
    kernel-module-mmngrbuf \
    kernel-module-qos \
    kernel-module-uvcs-drv \
    kernel-module-vsp2driver \
    kernel-module-vspm \
    kernel-module-vspmif \
"

RDEPENDS_packagegroup-rcar-gen3-host-firmware = " \
    gles-user-module-firmware \
"

