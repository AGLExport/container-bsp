#
# Copyright (C) 2007 OpenedHand Ltd.
#

SUMMARY = "Minimal boot requirements"
DESCRIPTION = "The minimal set of packages required to boot the system"
PR = "r17"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Distro can override the following VIRTUAL-RUNTIME providers:
VIRTUAL-RUNTIME_dev_manager ?= "udev"
VIRTUAL-RUNTIME_keymaps ?= "keymaps"

EFI_PROVIDER ??= "grub-efi"

#SYSVINIT_SCRIPTS = "${@bb.utils.contains('MACHINE_FEATURES', 'rtc', '${VIRTUAL-RUNTIME_base-utils-hwclock}', '', d)} \
#                    modutils-initscripts \
#                    init-ifupdown \
#                    ${VIRTUAL-RUNTIME_initscripts} \
#                   "

RDEPENDS_${PN} = "\
    base-files \
    base-passwd \
    ${VIRTUAL-RUNTIME_base-utils} \
    netbase \
    ${VIRTUAL-RUNTIME_login_manager} \
    ${VIRTUAL-RUNTIME_init_manager} \
    ${VIRTUAL-RUNTIME_dev_manager} \
    ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS}"



# 
#    ${VIRTUAL-RUNTIME_update-alternatives} 


RRECOMMENDS_${PN} = "\
    ${VIRTUAL-RUNTIME_base-utils-syslog} \
    ${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS}"
