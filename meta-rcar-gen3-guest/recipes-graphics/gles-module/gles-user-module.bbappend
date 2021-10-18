PACKAGES_append = "\
    ${PN}-firmware \
"

FILES_${PN} = " \
    ${libdir}/* \
    ${RENESAS_DATADIR}/bin/dlcsrv_REL \
"
SYSTEMD_SERVICE_${PN} = ""

FILES_${PN}-firmware = " \
    ${systemd_system_unitdir}/* \
    ${sysconfdir}/* \
    /lib/firmware/* \
    ${exec_prefix}/bin/pvrinit \
"
SYSTEMD_SERVICE_${PN}-firmware = "rc.pvr.service"

INITSCRIPT_PACKAGES = ""

RDEPENDS_${PN}_remove = "kernel-module-gles"
RDEPENDS_${PN}-firmware = "kernel-module-gles"
