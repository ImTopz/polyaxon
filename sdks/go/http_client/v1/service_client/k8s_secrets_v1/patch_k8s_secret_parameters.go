// Copyright 2019 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by go-swagger; DO NOT EDIT.

package k8s_secrets_v1

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"
	"net/http"
	"time"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/runtime"
	cr "github.com/go-openapi/runtime/client"

	strfmt "github.com/go-openapi/strfmt"

	service_model "github.com/polyaxon/polyaxon/sdks/go/http_client/v1/service_model"
)

// NewPatchK8sSecretParams creates a new PatchK8sSecretParams object
// with the default values initialized.
func NewPatchK8sSecretParams() *PatchK8sSecretParams {
	var ()
	return &PatchK8sSecretParams{

		timeout: cr.DefaultTimeout,
	}
}

// NewPatchK8sSecretParamsWithTimeout creates a new PatchK8sSecretParams object
// with the default values initialized, and the ability to set a timeout on a request
func NewPatchK8sSecretParamsWithTimeout(timeout time.Duration) *PatchK8sSecretParams {
	var ()
	return &PatchK8sSecretParams{

		timeout: timeout,
	}
}

// NewPatchK8sSecretParamsWithContext creates a new PatchK8sSecretParams object
// with the default values initialized, and the ability to set a context for a request
func NewPatchK8sSecretParamsWithContext(ctx context.Context) *PatchK8sSecretParams {
	var ()
	return &PatchK8sSecretParams{

		Context: ctx,
	}
}

// NewPatchK8sSecretParamsWithHTTPClient creates a new PatchK8sSecretParams object
// with the default values initialized, and the ability to set a custom HTTPClient for a request
func NewPatchK8sSecretParamsWithHTTPClient(client *http.Client) *PatchK8sSecretParams {
	var ()
	return &PatchK8sSecretParams{
		HTTPClient: client,
	}
}

/*PatchK8sSecretParams contains all the parameters to send to the API endpoint
for the patch k8s secret operation typically these are written to a http.Request
*/
type PatchK8sSecretParams struct {

	/*Body
	  Artifact store body

	*/
	Body *service_model.V1K8sResource
	/*K8sResourceUUID
	  UUID

	*/
	K8sResourceUUID string
	/*Owner
	  Owner of the namespace

	*/
	Owner string

	timeout    time.Duration
	Context    context.Context
	HTTPClient *http.Client
}

// WithTimeout adds the timeout to the patch k8s secret params
func (o *PatchK8sSecretParams) WithTimeout(timeout time.Duration) *PatchK8sSecretParams {
	o.SetTimeout(timeout)
	return o
}

// SetTimeout adds the timeout to the patch k8s secret params
func (o *PatchK8sSecretParams) SetTimeout(timeout time.Duration) {
	o.timeout = timeout
}

// WithContext adds the context to the patch k8s secret params
func (o *PatchK8sSecretParams) WithContext(ctx context.Context) *PatchK8sSecretParams {
	o.SetContext(ctx)
	return o
}

// SetContext adds the context to the patch k8s secret params
func (o *PatchK8sSecretParams) SetContext(ctx context.Context) {
	o.Context = ctx
}

// WithHTTPClient adds the HTTPClient to the patch k8s secret params
func (o *PatchK8sSecretParams) WithHTTPClient(client *http.Client) *PatchK8sSecretParams {
	o.SetHTTPClient(client)
	return o
}

// SetHTTPClient adds the HTTPClient to the patch k8s secret params
func (o *PatchK8sSecretParams) SetHTTPClient(client *http.Client) {
	o.HTTPClient = client
}

// WithBody adds the body to the patch k8s secret params
func (o *PatchK8sSecretParams) WithBody(body *service_model.V1K8sResource) *PatchK8sSecretParams {
	o.SetBody(body)
	return o
}

// SetBody adds the body to the patch k8s secret params
func (o *PatchK8sSecretParams) SetBody(body *service_model.V1K8sResource) {
	o.Body = body
}

// WithK8sResourceUUID adds the k8sResourceUUID to the patch k8s secret params
func (o *PatchK8sSecretParams) WithK8sResourceUUID(k8sResourceUUID string) *PatchK8sSecretParams {
	o.SetK8sResourceUUID(k8sResourceUUID)
	return o
}

// SetK8sResourceUUID adds the k8sResourceUuid to the patch k8s secret params
func (o *PatchK8sSecretParams) SetK8sResourceUUID(k8sResourceUUID string) {
	o.K8sResourceUUID = k8sResourceUUID
}

// WithOwner adds the owner to the patch k8s secret params
func (o *PatchK8sSecretParams) WithOwner(owner string) *PatchK8sSecretParams {
	o.SetOwner(owner)
	return o
}

// SetOwner adds the owner to the patch k8s secret params
func (o *PatchK8sSecretParams) SetOwner(owner string) {
	o.Owner = owner
}

// WriteToRequest writes these params to a swagger request
func (o *PatchK8sSecretParams) WriteToRequest(r runtime.ClientRequest, reg strfmt.Registry) error {

	if err := r.SetTimeout(o.timeout); err != nil {
		return err
	}
	var res []error

	if o.Body != nil {
		if err := r.SetBodyParam(o.Body); err != nil {
			return err
		}
	}

	// path param k8s_resource.uuid
	if err := r.SetPathParam("k8s_resource.uuid", o.K8sResourceUUID); err != nil {
		return err
	}

	// path param owner
	if err := r.SetPathParam("owner", o.Owner); err != nil {
		return err
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}