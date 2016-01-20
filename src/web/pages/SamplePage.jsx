import React from 'react';

import { Row, Col } from 'react-bootstrap';

import { PageHeader } from 'components/common';

const SamplePage = React.createClass({
  render() {
    return (
      <PageHeader title="Sample Plugin">
        <span>
          Hello from the Sample plugin!
        </span>
      </PageHeader>
    );
  }
});

export default SamplePage;
