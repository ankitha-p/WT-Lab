<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="person">
<br>
<b>
<xsl:value-of select="name" />
</b>
<xsl:value-of select="contact[1]/@type"/>:
<xsl:value-of select="contact[1]" />,
<xsl:value-of select="contact[2]/@type"/>:
<xsl:value-of select="contact[2]" />
</br>
</xsl:template>
</xsl:stylesheet>
